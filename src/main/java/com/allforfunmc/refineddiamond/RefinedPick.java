package com.allforfunmc.refineddiamond;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class RefinedPick extends ItemPickaxe{
	
	public RefinedPick(ToolMaterial mat){
		super(mat);
		setCreativeTab(Core.AllForFunTools);
		this.setTextureName("refineddiamondmod:refined_pickaxe");
		this.setMaxStackSize(1);
		this.setUnlocalizedName("refinedpick");
	}

}