package com.allforfunmc.refineddiamond;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HotDiamond extends Item{
	
	public HotDiamond(){
		super();
		setCreativeTab(Core.AllForFunItems);
		this.setTextureName("refineddiamondmod:hotdiamond");
		this.setMaxStackSize(64);
		this.setUnlocalizedName("hotdiamond");
	}

}