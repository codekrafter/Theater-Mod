package net.codekrafter.mods.theater.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TBlockBase extends Block
{

    public TBlockBase(Material materialIn)
    {
	super(materialIn);
    }
    
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

}
