package me.kbz.nostalgia;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventBus;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Core {
    @EventHandler
    public void preinit(FMLPreInitializationEvent e) {

    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        EventBus eb = MinecraftForge.EVENT_BUS;
        ClientCommandHandler cch = ClientCommandHandler.instance;

    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent e) {

    }
}
