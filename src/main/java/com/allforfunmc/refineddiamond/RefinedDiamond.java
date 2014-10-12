package com.allforfunmc.refineddiamond;

import net.minecraft.item.Item;

import com.allforfunmc.allforfuncore.Core;

public class RefinedDiamond extends Item {

    public RefinedDiamond() {
	super();
	setCreativeTab(Core.AllForFunItems);
	this.setTextureName("refineddiamondmod:refineddiamond");
	this.setMaxStackSize(16);
	this.setUnlocalizedName("refineddiamond");
    }

}