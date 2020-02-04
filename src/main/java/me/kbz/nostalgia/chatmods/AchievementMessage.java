package me.kbz.nostalgia.chatmods;

import me.kbz.nostalgia.Reference;
import me.kbz.nostalgia.util.KeyBindings;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class AchievementMessage {
    public static Property achievementMessageProp;

    @SubscribeEvent
    public void toggleAchMsg(InputEvent.KeyInputEvent e) {
        if (KeyBindings.achMsgToggle.isPressed()) {
            if (achievementMessageProp.isDefault()) {
                achievementMessageProp.set(false);
            } else {
                achievementMessageProp.set(true);
            }
            Reference.mc.thePlayer.addChatMessage(new ChatComponentText(getToggle()));
        }
    }

    @SubscribeEvent
    public void onAchGet(ClientChatReceivedEvent e) {
        String msg = e.message.getUnformattedText();

        if (msg.contains(">>") && msg.toLowerCase().contains("achievement unlocked:") && msg.contains("<<") && achievementMessageProp.isDefault()) {

            String[] parts = msg.split(":");

            String ach = parts[1]
                    .replace("<<", "")
                    .replaceAll("6", "")
                    .replace("a ", "")
                    .replace("ka", "")
                    .replace("  ", " ");

            StringBuilder sb = new StringBuilder(ach);
            sb.replace(ach.lastIndexOf("e"), ach.lastIndexOf("e") + 1, "");
            ach = sb.toString();

            Reference.mc.thePlayer.sendChatMessage("/gc >> I unlocked the" + ach + "achievement! <<");
        }
    }

    public static String getToggle() {
        return achievementMessageProp.isDefault() ? EnumChatFormatting.GREEN + "Callout Achievements Enabled!" : EnumChatFormatting.RED + "Callout Achievements Disabled!";
    }
}
