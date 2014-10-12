package com.allforfunmc.EarthStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.allforfunmc.allforfuncore.Core;

public class EarthOre extends Block {

    public EarthOre(Material mat) {
	super(mat);
	setBlockName("earth_ore");
	setCreativeTab(Core.AllForFunBlocks);
	this.setHardness(30f);
	this.setHarvestLevel("pickaxe", 3);
	this.setBlockTextureName("sleshymod:earth_ore");
    }

}
