package com.elementalores.blocks;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class FireBlock extends  Block{
	
	public FireBlock (Material mat){
		super(mat);
		setBlockName("fire_block");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setHardness(6f);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("sleshymod:fire_block");
		this.setLightLevel(2.0f);
	}

}
