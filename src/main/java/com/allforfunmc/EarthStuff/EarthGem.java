package com.allforfunmc.EarthStuff;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EarthGem extends Item{
	
	public EarthGem(int earthgemID){
		setUnlocalizedName("earth_gem");
		this.setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:earth_gem");
		
	}
		
}
