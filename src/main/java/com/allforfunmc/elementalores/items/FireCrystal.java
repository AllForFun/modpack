package com.elementalores.items;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FireCrystal extends Item{
	
	public FireCrystal(int firecrystalID){
		setUnlocalizedName("fire_crystal");
		this.setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:fire_crystal");
	}

}
