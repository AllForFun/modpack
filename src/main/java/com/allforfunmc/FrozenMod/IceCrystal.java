package com.allforfunmc.FrozenMod;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IceCrystal extends Item {
	
	public IceCrystal(int icecrystalID){
		setUnlocalizedName("ice_crystal");
		this.setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:ice_crystal");
	}

}
