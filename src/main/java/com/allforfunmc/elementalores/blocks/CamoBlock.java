package com.elementalores.blocks;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CamoBlock extends  Block{
	
	public CamoBlock (int camoblockID, Material mat){
		super(mat);
		setBlockName("camo_block");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setHardness(6f);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("sleshymod:camo_block");
	}
	
	@Override
	   public boolean isOpaqueCube()
	    {
	        return false;
	    }

}
