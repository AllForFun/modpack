package com.allforfunmc.obsidiantools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;

public class ObsidianAxe extends ItemAxe{
	
	public ObsidianAxe(ToolMaterial mat){
		super(mat);
		this.setCreativeTab(CreativeTabs.tabTools);
		setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName("obsidiantools:ObsidianAxe");
		this.setMaxStackSize(1);
		this.setUnlocalizedName("ObsidianAxe");
	}

}