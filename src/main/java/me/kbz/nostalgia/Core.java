package me.kbz.nostalgia;

import me.kbz.nostalgia.commands.Emojis;
import me.kbz.nostalgia.commands.Help;
import me.kbz.nostalgia.commands.Rau;
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



        ClientCommandHandler cch = ClientCommandHandler.instance;

        cch.registerCommand(new Help());
        cch.registerCommand(new Emojis());
        cch.registerCommand(new Rau());


    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent e) {

    }
}
