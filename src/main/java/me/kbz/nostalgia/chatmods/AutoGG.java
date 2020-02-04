package me.kbz.nostalgia.chatmods;

import me.kbz.nostalgia.Reference;
import me.kbz.nostalgia.chatmods.handlers.AutoGGHandler;
import me.kbz.nostalgia.util.ChatTriggers;
import me.kbz.nostalgia.util.KeyBindings;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

import java.util.Timer;
import java.util.TimerTask;

public class AutoGG extends TimerTask {
    public static Property autoGGProp;
    private static Timer autoGG = new Timer();

    @SubscribeEvent
    public void toggleAutoGG(InputEvent.KeyInputEvent e) {
        if (KeyBindings.autoGGToggle.isPressed()) {
            if (autoGGProp.isDefault()) {
                autoGGProp.set(false);
            } else {
                autoGGProp.set(true);
            }
            Reference.mc.thePlayer.addChatMessage(new ChatComponentText(getToggle()));
        }
    }

    @SubscribeEvent
    public void autoGG(ClientChatReceivedEvent e) {
        String msg = e.message.getUnformattedText();
        System.out.println(msg);
        if (autoGGProp.isDefault()) {
            if (ChatTriggers.getTriggers().stream().anyMatch(trigger -> msg.contains(trigger.toString())) && msg.startsWith(" ")) {
                System.out.println("THIS WORKS!");
                AutoGGHandler.autoGG.schedule(new AutoGGHandler(), 1000);
            }
        }
    }

    public static String getToggle() {
        return autoGGProp.isDefault() ? EnumChatFormatting.GREEN + "AutoGG Enabled!" : EnumChatFormatting.RED + "AutoGG Disabled!";
    }

    @Override
    public void run() {
        Reference.mc.thePlayer.sendChatMessage("/ac gg");
    }
}
