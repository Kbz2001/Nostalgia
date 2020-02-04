package me.kbz.nostalgia.chatmods;

import me.kbz.nostalgia.Reference;
import me.kbz.nostalgia.util.KeyBindings;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class GuildWelcome {
    public static Property guildWelcomeProp;

    @SubscribeEvent
    public void toggleAutoGuildWelcome(InputEvent.KeyInputEvent e) {
        if (KeyBindings.gwToggle.isPressed()) {
            if (guildWelcomeProp.isDefault()) {
                guildWelcomeProp.set(false);
            } else {
                guildWelcomeProp.set(true);
            }
            Reference.mc.thePlayer.addChatMessage(new ChatComponentText(getGWToggle()));
        }
    }

    @SubscribeEvent
    public void onPlayerJoinGuild(ClientChatReceivedEvent e) {
        String msg = e.message.getUnformattedText();

        if (msg.toLowerCase().contains("joined the guild!") && guildWelcomeProp.isDefault()) {

            String[] parts = msg.split("joined");
            String usernameJoined = parts[0];

            Reference.mc.thePlayer.sendChatMessage("/gc Welcome to the guild " + usernameJoined + ":D!");

        }
    }

    public static String getGWToggle() {
        return guildWelcomeProp.isDefault() ? EnumChatFormatting.GREEN + "Automated Guild Welcome Enabled!" : EnumChatFormatting.RED + "Automated Guild Welcome Disabled!";
    }
}
