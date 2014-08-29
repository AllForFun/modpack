package com.allforfunmc.creeperore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreeperPearl extends Item{
	public CreeperPearl(){
		super();
		setCreativeTab(com.allforfunmc.refineddiamond.Code.AllForFunTab);
		this.setTextureName("creeperore:creeperpearl");
		this.setMaxStackSize(16);
		this.setUnlocalizedName("creeperore");
	}

}