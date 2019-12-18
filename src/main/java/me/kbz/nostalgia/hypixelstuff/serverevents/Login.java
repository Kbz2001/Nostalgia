package me.kbz.nostalgia.hypixelstuff.serverevents;

import me.kbz.nostalgia.Reference;
import me.kbz.nostalgia.commands.handlers.RunHelpHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Login {

    Minecraft mc = Reference.mc;

    @SubscribeEvent
    public void onLogin(EntityJoinWorldEvent e)
    {

        if(!mc.isSingleplayer() && ServerChecker.isHypixel && e.entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)e.entity;

            if(player.getName() == mc.thePlayer.getName() && ServerChecker.counter == 0) {
                RunHelpHandler.runHelpCmd.schedule(new RunHelpHandler(), 2 * 1000);
                ServerChecker.counter++;

            }
        }
    }
}
