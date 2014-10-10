package com.allforfunmc.CamoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.allforfunmc.allforfuncore.Core;

public class CamoBlock extends Block {

    public CamoBlock(Material mat) {
	super(mat);
	setBlockName("camo_block");
	setCreativeTab(Core.AllForFunBlocks);
	this.setHardness(6f);
	this.setHarvestLevel("pickaxe", 3);
	this.setBlockTextureName("sleshymod:camo_block");
    }

    @Override
    public boolean isOpaqueCube() {
	return false;
    }

}
