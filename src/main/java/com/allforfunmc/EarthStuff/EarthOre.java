package com.allforfunmc.EarthStuff;

import com.allforfunmc.elementalores.BlocksAndItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EarthOre extends  Block{
	
	public EarthOre (int earthoreID, Material mat){
		super(mat);
		setBlockName("earth_ore");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setHardness(30f);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("sleshymod:earth_ore");
	}

}
