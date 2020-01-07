package me.kbz.nostalgia.hypixelstuff.serverevents;

import me.kbz.nostalgia.Reference;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

public class ServerChecker {

    public static boolean isHypixel = false;
    public static int counter = 0;

    @SubscribeEvent
    public void serverConnect(FMLNetworkEvent.ClientConnectedToServerEvent e) {

        try {
            if (Reference.mc.getCurrentServerData().serverIP.contains("hypixel.net")) {
                isHypixel = true;
                //setGamesFalse();
            } else {
                isHypixel = false;

            }
        } catch (NullPointerException ex) {

        }
    }

    @SubscribeEvent
    public void serverDisconnect(FMLNetworkEvent.ClientDisconnectionFromServerEvent e) {
        try {
            if (Reference.mc.getCurrentServerData().serverIP.contains("hypixel.net")) {

                isHypixel = false;
                //setGamesFalse();
                counter = 0;
            }
        } catch (NullPointerException ex) {

        }
    }
}
