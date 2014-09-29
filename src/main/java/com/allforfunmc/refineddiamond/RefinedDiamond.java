package com.allforfunmc.refineddiamond;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RefinedDiamond extends Item{
	
	public RefinedDiamond(){
		super();
		setCreativeTab(Core.AllForFunItems);
		this.setTextureName("refineddiamondmod:refineddiamond");
		this.setMaxStackSize(16);
		this.setUnlocalizedName("refineddiamond");
	}

}