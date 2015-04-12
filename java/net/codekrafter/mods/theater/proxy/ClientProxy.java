package net.codekrafter.mods.theater.proxy;

import net.codekrafter.mods.theater.init.TheaterBlocks;
import net.codekrafter.mods.theater.init.TheaterItems;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
	TheaterItems.registerRenders();
	TheaterBlocks.registerRenders();
    }
}
