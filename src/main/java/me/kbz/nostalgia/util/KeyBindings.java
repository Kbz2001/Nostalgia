package me.kbz.nostalgia.util;

import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class KeyBindings {
    public static KeyBinding achMsgToggle;
    public static KeyBinding autoGGToggle;
    public static KeyBinding autoTipToggle;
    public static KeyBinding gwToggle;
    public static KeyBinding ntwkLvlToggle;

    public static KeyBinding getAchMsgToggle() {
        achMsgToggle = new KeyBinding("Toggle Achievement Message Callouts", Keyboard.KEY_NONE, "Nostalgia");
        return achMsgToggle;
    }

    public static KeyBinding getAutoGGToggle() {
        autoGGToggle = new KeyBinding("Toggle AutoGG", Keyboard.KEY_NONE, "Nostalgia");
        return autoGGToggle;
    }

    public static KeyBinding getAutoTipToggle() {
        autoTipToggle = new KeyBinding("Toggle AutoTip", Keyboard.KEY_NONE, "Nostalgia");
        return autoTipToggle;
    }

    public static KeyBinding getGwToggle() {
        gwToggle = new KeyBinding("Toggle Automated Guild Welcome", Keyboard.KEY_NONE, "Nostalgia");
        return gwToggle;
    }

    public static KeyBinding getNtwkLvlToggle() {
        ntwkLvlToggle = new KeyBinding("Toggle Network Level-Up Callouts", Keyboard.KEY_NONE, "Nostalgia");
        return ntwkLvlToggle;
    }
}
