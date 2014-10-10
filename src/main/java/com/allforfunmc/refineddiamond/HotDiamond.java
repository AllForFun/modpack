package com.allforfunmc.refineddiamond;

import net.minecraft.item.Item;

import com.allforfunmc.allforfuncore.Core;

public class HotDiamond extends Item {

    public HotDiamond() {
	super();
	setCreativeTab(Core.AllForFunItems);
	this.setTextureName("refineddiamondmod:hotdiamond");
	this.setMaxStackSize(64);
	this.setUnlocalizedName("hotdiamond");
    }

}