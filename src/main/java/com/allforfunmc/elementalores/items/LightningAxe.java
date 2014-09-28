package com.elementalores.items;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class LightningAxe extends ItemAxe{
	
	public LightningAxe(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("lightning_axe");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:lightning_axe");
	}

}
