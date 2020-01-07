package me.kbz.nostalgia.chatmods;

import me.kbz.nostalgia.Reference;
import me.kbz.nostalgia.util.KeyBindings;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class AutoGG {
    public static Property autoGGProp;

    @SubscribeEvent
    public void toggleAutoGG(InputEvent.KeyInputEvent e) {
        if(KeyBindings.autoGGToggle.isPressed()){
            if(autoGGProp.isDefault()){
                autoGGProp.set(false);
            }
            else{
                autoGGProp.set(true);
            }
            Reference.mc.thePlayer.addChatMessage(new ChatComponentText(getToggle()));
        }
    }

    @SubscribeEvent
    public void autoGG(ClientChatReceivedEvent e) {

    }

    public static String getToggle() {
        return autoGGProp.isDefault() ? EnumChatFormatting.GREEN +  "AutoGG Enabled!" : EnumChatFormatting.RED + "AutoGG Disabled!";
    }
}
