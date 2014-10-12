package com.allforfunmc.chocolatestuff;

import net.minecraft.item.Item;

import com.allforfunmc.allforfuncore.Core;

public class MeltedChocolate extends Item {
    public MeltedChocolate() {
	super();
	this.setCreativeTab(Core.AllForFunFood);
	this.setTextureName("chocolatestuff:meltedChocolate");
	this.setUnlocalizedName("meltedChocolate");
	this.setMaxStackSize(1);
    }
}
