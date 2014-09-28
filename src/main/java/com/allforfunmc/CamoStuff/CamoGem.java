package com.allforfunmc.CamoStuff;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CamoGem extends Item{
	
	public CamoGem(int camogemID){
		setUnlocalizedName("camo_gem");
		this.setCreativeTab(Core.AllForFunItems);
		this.setTextureName("sleshymod:camo_gem");
		
	}
		
}
