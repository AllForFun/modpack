package com.allforfunmc.CamoStuff;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CamoGem extends Item{
	
	public CamoGem(int camogemID){
		setUnlocalizedName("camo_gem");
		this.setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:camo_gem");
		
	}
		
}
