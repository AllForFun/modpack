package com.allforfunmc.FrozenMod;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class IceSword extends ItemSword{
	
	public IceSword(ToolMaterial mat){
		super(mat);
		.setMaxStackSize(1).setUnlocalizedName("ice_sword").setCreativeTab(Core.AllForFunTools).setTextureName("sleshymod:ice_sword");
	}

}
