package com.allforfunmc.fire;

import com.allforfunmc.allforfuncore.Core;
import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class FireHoe extends ItemHoe{
	
	public FireHoe(ToolMaterial mat){
		super(mat);
		.setMaxStackSize(1).setUnlocalizedName("fire_hoe").setCreativeTab(Core.AllForFunTools).setTextureName("sleshymod:fire_hoe");
	}

}
