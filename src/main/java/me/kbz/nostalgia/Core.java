package me.kbz.nostalgia;

import me.kbz.nostalgia.chatmods.*;
import me.kbz.nostalgia.commands.*;
import me.kbz.nostalgia.discord.DiscordPresence;
import me.kbz.nostalgia.hypixelstuff.serverevents.Login;
import me.kbz.nostalgia.hypixelstuff.serverevents.ServerChecker;
import me.kbz.nostalgia.util.Config;
import me.kbz.nostalgia.util.KeyBindings;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventBus;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Core {
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        Config.initConfig(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        EventBus eb = MinecraftForge.EVENT_BUS;

        //Server Events
        eb.register(new Login());
        eb.register(new ServerChecker());

        //Chat Mods
        eb.register(new AchievementMessage());
        eb.register(new AutoGG());
        eb.register(new AutoTip());
        eb.register(new GuildWelcome());
        eb.register(new NetworkLevelMessage());

        ClientCommandHandler cch = ClientCommandHandler.instance;

        cch.registerCommand(new Help());
        cch.registerCommand(new Emojis());
        cch.registerCommand(new Rau());
        cch.registerCommand(new PartyAll());
        cch.registerCommand(new GuildAll());
        cch.registerCommand(new InGame());


        //Key Bindings
        ClientRegistry.registerKeyBinding(KeyBindings.getAchMsgToggle());
        ClientRegistry.registerKeyBinding(KeyBindings.getAutoGGToggle());
        ClientRegistry.registerKeyBinding(KeyBindings.getAutoTipToggle());
        ClientRegistry.registerKeyBinding(KeyBindings.getGwToggle());
        ClientRegistry.registerKeyBinding(KeyBindings.getNtwkLvlToggle());

        DiscordPresence.INSTANCE.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }
}
