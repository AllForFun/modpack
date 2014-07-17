package com.allforfunmc.refineddiamond;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HotDiamond extends Item{
	
	public HotDiamond(){
		super();
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName("refineddiamondmod:hotdiamond");
		this.setMaxStackSize(64);
		this.setUnlocalizedName("hotdiamond");
	}

}