package me.kbz.nostalgia.commands.handlers;

import me.kbz.nostalgia.Reference;
import me.kbz.nostalgia.commands.PartyAll;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.command.ICommandSender;

import java.util.Collection;

public class PartyAllHandler {

    public static void PartyAll(ICommandSender sender) {

        Collection<NetworkPlayerInfo> playersC = Reference.mc.getNetHandler().getPlayerInfoMap();

        playersC.forEach(loadedPlayer -> {

            PartyAll.playerName = loadedPlayer.getGameProfile().getName();
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/party invite " + PartyAll.playerName);

            try {
                Thread.sleep(500L);
            }

            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
