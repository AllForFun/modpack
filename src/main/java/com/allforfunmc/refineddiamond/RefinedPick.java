package com.allforfunmc.refineddiamond;

import net.minecraft.item.ItemPickaxe;

import com.allforfunmc.allforfuncore.Core;

public class RefinedPick extends ItemPickaxe {

    public RefinedPick(ToolMaterial mat) {
	super(mat);
	setCreativeTab(Core.AllForFunTools);
	this.setTextureName("refineddiamondmod:refined_pickaxe");
	this.setMaxStackSize(1);
	this.setUnlocalizedName("refinedpick");
    }

}