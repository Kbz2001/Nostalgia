package me.kbz.nostalgia.hypixelstuff.serverevents;

import me.kbz.nostalgia.Reference;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

public class ServerChecker {

    Minecraft mc = Reference.mc;

    public static boolean isHypixel = false;
    public static int counter = 0;

    @SubscribeEvent
    public void serverConnect(FMLNetworkEvent.ClientConnectedToServerEvent e)
    {

        if(mc.getCurrentServerData().serverIP.contains("hypixel.net"))
        {

            isHypixel = true;

            //setGamesFalse();

        }

        else
        {

            isHypixel = false;

        }
    }

    @SubscribeEvent
    public void serverDisconnect(FMLNetworkEvent.ClientDisconnectionFromServerEvent e)
    {

        if(mc.getCurrentServerData().serverIP.contains("hypixel.net"))
        {

            isHypixel = false;

            //setGamesFalse();

            counter = 0;

        }
    }
}
