package com.allforfunmc.CamoStuff;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class CamoSword extends ItemSword{
	
	public CamoSword(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("camo_sword");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:camo_sword");
	}

}
