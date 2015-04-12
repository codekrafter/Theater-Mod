package net.codekrafter.mods.theater;

import net.codekrafter.mods.theater.init.TheaterItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TheaterTab extends CreativeTabs
{

    public TheaterTab(String label)
    {
	super(label);
	//this.setBackgroundImageName("tutorial.png");
    }

    @Override
    public Item getTabIconItem()
    {
	return TheaterItems.test_item;
    }

}
