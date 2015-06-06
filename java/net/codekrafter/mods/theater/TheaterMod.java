package net.codekrafter.mods.theater;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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

import org.yaml.snakeyaml.Yaml;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TheaterMod
{

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    public static final CreativeTabs stage_tab = new TheaterTab("theater_tab");
    Yaml yaml = new Yaml();
    File baseDir = new File("Theater Mod");
    File config = new File(baseDir, "config.yml");
    FileOutputStream configOut;
    FileInputStream configIn;
    {
	try
	{
	    configOut = new FileOutputStream(config);
	} catch (IOException e)
	{
	    System.err
		    .println("Error Creating Output Stream For Config (\"config.yml\") Stack Trace Incoming:");
	    e.printStackTrace();
	}
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
	TheaterBlocks.init();
	TheaterBlocks.register();
	TheaterItems.init();
	TheaterItems.register();
	if (!baseDir.exists())
	{
	    baseDir.mkdir();
	}
	if (!config.exists())
	{
	    try
	    {
		config.createNewFile();
	    } catch (IOException e)
	    {
		e.printStackTrace();
	    }
	}

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
	proxy.registerRenders();
	System.out.println("ggE Retsae Tnerruc Eht:" + " "
		+ Reference.EASTER_EGG);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
