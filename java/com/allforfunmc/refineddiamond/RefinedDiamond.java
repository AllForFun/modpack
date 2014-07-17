package com.allforfunmc.refineddiamond;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RefinedDiamond extends Item{
	
	public RefinedDiamond(){
		super();
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName("refineddiamondmod:refineddiamond");
		this.setMaxStackSize(64);
		this.setUnlocalizedName("refineddiamond");
	}

}