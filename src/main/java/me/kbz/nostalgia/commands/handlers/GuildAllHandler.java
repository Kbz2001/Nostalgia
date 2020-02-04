package me.kbz.nostalgia.commands.handlers;

import me.kbz.nostalgia.Reference;
import me.kbz.nostalgia.commands.GuildAll;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.command.ICommandSender;

import java.util.Collection;

public class GuildAllHandler {

    public static void GuildAll(ICommandSender sender) {

        Collection<NetworkPlayerInfo> playersC = Reference.mc.getNetHandler().getPlayerInfoMap();

        playersC.forEach(loadedPlayer -> {

            GuildAll.playerName = loadedPlayer.getGameProfile().getName();
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/guild invite " + GuildAll.playerName);

            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
