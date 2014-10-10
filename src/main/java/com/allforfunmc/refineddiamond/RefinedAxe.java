package com.allforfunmc.refineddiamond;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import com.allforfunmc.allforfuncore.Core;

public class RefinedAxe extends ItemAxe {

    public RefinedAxe(ToolMaterial mat) {
	super(mat);
	this.setCreativeTab(CreativeTabs.tabTools);
	setCreativeTab(Core.AllForFunTools);
	this.setTextureName("refineddiamondmod:refinedaxe");
	this.setMaxStackSize(1);
	this.setUnlocalizedName("refinedaxe");
    }

}