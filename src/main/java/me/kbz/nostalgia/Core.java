package me.kbz.nostalgia;

import me.kbz.nostalgia.commands.*;

import me.kbz.nostalgia.hypixelstuff.serverevents.Login;
import me.kbz.nostalgia.hypixelstuff.serverevents.ServerChecker;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventBus;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Core {
    @EventHandler
    public void preinit(FMLPreInitializationEvent e) {

    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        EventBus eb = MinecraftForge.EVENT_BUS;

        eb.register(new Login());
        eb.register(new ServerChecker());



        ClientCommandHandler cch = ClientCommandHandler.instance;

        cch.registerCommand(new Help());
        cch.registerCommand(new Emojis());
        cch.registerCommand(new Rau());
        cch.registerCommand(new InGame());
        cch.registerCommand(new PartyAll());
        cch.registerCommand(new GuildAll());


    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent e) {

    }
}
