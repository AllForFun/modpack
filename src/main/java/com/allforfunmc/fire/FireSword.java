package com.allforfunmc.fire;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class FireSword extends ItemSword{
	
	public FireSword(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("fire_sword");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:fire_sword");
	}

}
