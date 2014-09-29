package com.allforfunmc.EarthStuff;


import com.allforfunmc.allforfuncore.Core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class EarthAxe extends ItemAxe{
	
	public EarthAxe(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("earth_axe");
		setCreativeTab(Core.AllForFunTools);
		this.setTextureName("sleshymod:earth_axe");
	}

}
