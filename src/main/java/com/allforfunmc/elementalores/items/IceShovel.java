package com.elementalores.items;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

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
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:ice_shovel");
	}

}
