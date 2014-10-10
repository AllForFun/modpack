package com.allforfunmc.EarthStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.allforfunmc.allforfuncore.Core;

public class EarthBlock extends Block {

    public EarthBlock(Material mat) {
	super(mat);
	setBlockName("earth_block");
	setCreativeTab(Core.AllForFunBlocks);
	this.setHardness(6f);
	this.setHarvestLevel("pickaxe", 3);
	this.setBlockTextureName("sleshymod:earth_block");
    }

}
