package com.allforfunmc.chocolatestuff;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.item.Item;

public class MeltedChocolate extends Item {
	public MeltedChocolate(){
		super();
		this.setCreativeTab(Core.AllForFunFood);
		this.setTextureName("chocolatestuff:meltedChocolate");
		this.setUnlocalizedName("meltedChocolate");
		this.setMaxStackSize(1);
	}
}
