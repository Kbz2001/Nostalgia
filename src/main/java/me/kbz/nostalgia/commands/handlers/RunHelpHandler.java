package me.kbz.nostalgia.commands.handlers;

import me.kbz.nostalgia.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import java.util.Timer;
import java.util.TimerTask;

public class RunHelpHandler extends TimerTask {

    Minecraft mc = Reference.mc;
    public static Timer runHelpCmd = new Timer();

    @Override
    public void run() {
        mc.thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Welcome to Nostalgia! To get started type /nostalgia help."));

    }
}
