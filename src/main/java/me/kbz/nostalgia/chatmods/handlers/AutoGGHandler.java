package me.kbz.nostalgia.chatmods.handlers;

import me.kbz.nostalgia.Reference;

import java.util.Timer;
import java.util.TimerTask;

public class AutoGGHandler extends TimerTask {
    public static Timer autoGG = new Timer();

    @Override
    public void run() {
        Reference.mc.thePlayer.sendChatMessage("/ac gg");
    }
}
