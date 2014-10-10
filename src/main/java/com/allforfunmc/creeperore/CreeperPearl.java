package com.allforfunmc.creeperore;

import net.minecraft.item.Item;

import com.allforfunmc.allforfuncore.Core;

public class CreeperPearl extends Item {
    public CreeperPearl() {
	super();
	setCreativeTab(Core.AllForFunItems);
	this.setTextureName("creeperore:creeperpearl");
	this.setMaxStackSize(16);
	this.setUnlocalizedName("creeperpearl");
    }

}