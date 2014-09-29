package com.allforfunmc.creeperore;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreeperPearl extends Item{
	public CreeperPearl(){
		super();
		setCreativeTab(Core.AllForFunItems);
		this.setTextureName("creeperore:creeperpearl");
		this.setMaxStackSize(16);
		this.setUnlocalizedName("creeperpearl");
	}

}