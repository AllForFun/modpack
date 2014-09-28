package com.allforfunmc.LightningMod;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class LightningHoe extends ItemHoe{
	
	public LightningHoe(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("lightning_hoe");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:lightning_hoe");
	}

}
