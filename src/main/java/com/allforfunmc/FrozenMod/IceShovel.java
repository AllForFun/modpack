package com.allforfunmc.FrozenMod;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class IceShovel extends ItemSpade{
	
	public IceShovel(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("ice_shovel");
		setCreativeTab(Core.AllForFunTools);
		this.setTextureName("sleshymod:ice_shovel");
	}

}
