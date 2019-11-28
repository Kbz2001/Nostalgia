package me.kbz.nostalgia;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Core.MODID, version = Core.VERSION)
public class Core {

    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preinit(FMLPreInitializationEvent e) {

    }

    @EventHandler
    public void init(FMLInitializationEvent e) {

    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent e) {

    }

}
