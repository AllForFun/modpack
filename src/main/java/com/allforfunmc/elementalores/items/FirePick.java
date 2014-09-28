package com.elementalores.items;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class FirePick extends ItemPickaxe{
	
	public FirePick(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("fire_pick");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:fire_pick");
	}

}
