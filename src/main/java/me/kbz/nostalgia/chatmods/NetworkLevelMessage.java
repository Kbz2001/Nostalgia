package me.kbz.nostalgia.chatmods;

import me.kbz.nostalgia.Reference;
import me.kbz.nostalgia.util.KeyBindings;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class NetworkLevelMessage {
    public static Property networkLevelProp;

    @SubscribeEvent
    public void toggleLvlMsg(InputEvent.KeyInputEvent e) {
        if (KeyBindings.ntwkLvlToggle.isPressed()) {
            if (networkLevelProp.isDefault()) {
                networkLevelProp.set(false);
            } else {
                networkLevelProp.set(true);
            }
            Reference.mc.thePlayer.addChatMessage(new ChatComponentText(getToggle()));
        }
    }

    @SubscribeEvent
    public void onLvlUp(ClientChatReceivedEvent e) {

        String msg = e.message.getUnformattedText();

        if (msg.toLowerCase().contains("you are now hypixel level") && networkLevelProp.isDefault()) {
            String[] parts = msg.split("Level");
            String hypixelLevel = parts[1];

            Reference.mc.thePlayer.sendChatMessage("/gc >> Level Up! I am now Hypixel Level" + hypixelLevel + " <<");
        }
    }

    public static String getToggle() {
        return networkLevelProp.isDefault() ? EnumChatFormatting.GREEN + "Callout Level-Ups Enabled!" : EnumChatFormatting.RED + "Callout Level-Ups Disabled!";
    }
}
