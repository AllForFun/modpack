package com.allforfunmc.obsidiontools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;

public class ObsidionPickaxe extends ItemPickaxe{
	
	public ObsidionPickaxe(ToolMaterial mat){
		super(mat);
		this.setCreativeTab(CreativeTabs.tabTools);
		setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName("obsidiontools:ObsidionPick");
		this.setMaxStackSize(1);
		this.setUnlocalizedName("ObsidionPickaxe");
	}

}