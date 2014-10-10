package com.allforfunmc.CamoStuff;

import net.minecraft.item.ItemAxe;

import com.allforfunmc.allforfuncore.Core;

public class CamoAxe extends ItemAxe {

    public CamoAxe(ToolMaterial mat) {
	super(mat);
	this.setMaxStackSize(1);
	setUnlocalizedName("camo_axe");
	setCreativeTab(Core.AllForFunTools);
	this.setTextureName("sleshymod:camo_axe");
    }

}
