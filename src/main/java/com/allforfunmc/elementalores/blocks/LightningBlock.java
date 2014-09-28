package com.elementalores.blocks;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LightningBlock extends  Block{
	
	public LightningBlock (int lightningblockID, Material mat){
		super(mat);
		setBlockName("lightning_block");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setHardness(6f);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("sleshymod:lightning_block");
		this.setLightLevel(2.0f);
	}

}
