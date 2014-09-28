package com.elementalores.blocks;

import com.elementalores.elementaloresmod.Blocks;
import com.elementalores.elementaloresmod.ElementalOresMod;
import com.elementalores.elementaloresmod.Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class FireOre extends  Block{
	
	public FireOre (Material mat){
		super(mat);
		setBlockName("fire_ore");
		setCreativeTab(Items.moditemsTab);
		this.setHardness(6f);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("sleshymod:fire_ore");
		this.setLightLevel(2.0f);
	}

}
