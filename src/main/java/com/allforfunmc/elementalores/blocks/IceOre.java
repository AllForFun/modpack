package com.elementalores.blocks;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class IceOre extends  Block{
	
	public IceOre (int iceoreID, Material mat){
		super(mat);
		setBlockName("ice_ore");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setHardness(6f);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("sleshymod:ice_ore");
	}

}
