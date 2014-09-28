package com.elementalores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CamoOre extends  Block{
	
	public CamoOre (Material mat){
		super(mat);
		setBlockName("camo_ore");
		setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(6f);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("sleshymod:camo_ore");
	}

}
