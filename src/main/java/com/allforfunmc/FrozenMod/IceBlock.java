package com.allforfunmc.FrozenMod;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class IceBlock extends  Block{
	
	public IceBlock (int iceblockID, Material mat){
		super(mat);
		setBlockName("ice_block");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setHardness(6f);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("sleshymod:ice_block");
	}

}
