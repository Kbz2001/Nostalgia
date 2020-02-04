package me.kbz.nostalgia.chatmods;

import me.kbz.nostalgia.Reference;
import me.kbz.nostalgia.hypixelstuff.serverevents.ServerChecker;
import me.kbz.nostalgia.util.KeyBindings;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.Timer;
import java.util.TimerTask;

public class AutoTip extends TimerTask {
    public static Property autoTipProp;
    private int tickCounter = 0;
    private static Timer autoTip = new Timer();

    @SubscribeEvent
    public void toggleAutoTip(InputEvent.KeyInputEvent e) {
        if (KeyBindings.autoTipToggle.isPressed()) {
            if (autoTipProp.isDefault()) {
                autoTipProp.set(false);

            } else {
                autoTipProp.set(true);
            }
            Reference.mc.thePlayer.addChatMessage(new ChatComponentText(getToggle()));
        }
    }

    @SubscribeEvent
    public void tipUsers(TickEvent.ClientTickEvent e) {
        int oneSecond = 20;
        int oneMinute = oneSecond * 60;

        if (autoTipProp.isDefault() && ServerChecker.isHypixel) {

            if (tickCounter < oneMinute * 15) {

                tickCounter++;
                System.out.println(tickCounter);

            } else {

                tickCounter = 0;
                AutoTip.autoTip.schedule(new AutoTip(), 0);

            }
        }
    }

    public static String getToggle() {

        return autoTipProp.isDefault() ? EnumChatFormatting.GREEN + "AutoTip Enabled!" : EnumChatFormatting.RED + "AutoTip Disabled!";

    }

    @Override
    public void run() {
        Reference.mc.thePlayer.sendChatMessage("/tipall");
    }
}
