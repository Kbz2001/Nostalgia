package me.kbz.nostalgia.util;

import me.kbz.nostalgia.chatmods.*;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Config {
    public static Configuration config;

    public static void initConfig(FMLPreInitializationEvent e) {
        config = new Configuration(e.getSuggestedConfigurationFile());

        config.load();

        AchievementMessage.achievementMessageProp = config.get("Nostalgia", "AchievementMessage", true, "");
        AutoGG.autoGGProp = config.get("Nostalgia", "AutoGG", true, "");
        AutoTip.autoTipProp = config.get("Nostalgia", "AutoTip", true, "");
        GuildWelcome.guildWelcomeProp = config.get("Nostalgia", "GuildWelcome", true, "");
        NetworkLevelMessage.networkLevelProp = config.get("Nostalgia", "NetworkLevelUp", true, "");

        config.save();
    }
}
