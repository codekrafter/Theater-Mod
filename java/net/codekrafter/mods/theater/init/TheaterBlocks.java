package net.codekrafter.mods.theater.init;

import net.codekrafter.mods.theater.Reference;
import net.codekrafter.mods.theater.TheaterMod;
import net.codekrafter.mods.theater.blocks.TBlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TheaterBlocks
{

    public static Block stage_top;
    public static Block stage;
    public static Block curtain;
    public static Block curtainb;
    public static Block truss;

    // public static Block par_can;

    public static void init()
    {
	stage_top = new TBlockBase(Material.wood)
		.setUnlocalizedName("stage_top").setCreativeTab(
			TheaterMod.stage_tab);
	stage_top.setBlockBounds(new Float(stage_top.getBlockBoundsMinX()),
		new Float(0.0), new Float(stage_top.getBlockBoundsMinZ()),
		new Float(stage_top.getBlockBoundsMaxX()), new Float(0.44),
		new Float(stage_top.getBlockBoundsMaxZ()));

	stage = new TBlockBase(Material.wood).setUnlocalizedName("stage")
		.setCreativeTab(TheaterMod.stage_tab);
	curtain = new TBlockBase(Material.cloth).setUnlocalizedName("curtain");
	curtain.setBlockBounds(new Float(0), new Float(0.0), new Float(0.4),
		new Float(1), new Float(1), new Float(0.7));
	curtainb = new TBlockBase(Material.iron).setUnlocalizedName("curtainb")
		.setCreativeTab(TheaterMod.stage_tab);
	curtainb.setBlockBounds(new Float(0), new Float(0.0), new Float(0.4),
		new Float(1), new Float(0.22), new Float(0.7));
	truss = new TBlockBase(Material.iron).setUnlocalizedName("truss")
		.setCreativeTab(TheaterMod.stage_tab);

	// par_can = new BlockBase(Material.iron).setUnlocalizedName("par_can")
	// .setCreativeTab(TheaterMod.main_tab);
    }

    public static void register()
    {
	GameRegistry.registerBlock(stage_top, stage_top.getUnlocalizedName()
		.substring(5));
	GameRegistry.registerBlock(stage,
		stage.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(curtain, curtain.getUnlocalizedName()
		.substring(5));
	GameRegistry.registerBlock(curtainb, curtainb.getUnlocalizedName()
		.substring(5));
	GameRegistry.registerBlock(truss, truss.getUnlocalizedName()
		.substring(5));
	// GameRegistry.registerBlock(par_can,
	// par_can.getUnlocalizedName().substring(5));
    }

    public static void registerRenders()
    {
	registerRender(stage_top);
	registerRender(stage);
	registerRender(curtain);
	registerRender(curtainb);
	registerRender(truss);
	// registerRender(par_can);
    }

    public static void registerRender(Block block)
    {
	Item item = Item.getItemFromBlock(block);
	Minecraft
		.getMinecraft()
		.getRenderItem()
		.getItemModelMesher()
		.register(
			item,
			0,
			new ModelResourceLocation(Reference.MOD_ID + ":"
				+ item.getUnlocalizedName().substring(5),
				"inventory"));
    }
}
