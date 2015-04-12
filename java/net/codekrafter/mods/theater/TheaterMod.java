package net.codekrafter.mods.theater;

import net.codekrafter.mods.theater.init.TheaterBlocks;
import net.codekrafter.mods.theater.init.TheaterItems;
import net.codekrafter.mods.theater.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TheaterMod
{

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    public static final CreativeTabs stage_tab = new TheaterTab("theater_tab");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
	TheaterBlocks.init();
	TheaterBlocks.register();
	TheaterItems.init();
	TheaterItems.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
	proxy.registerRenders();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
