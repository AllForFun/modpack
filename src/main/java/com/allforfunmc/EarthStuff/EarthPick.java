package com.allforfunmc.EarthStuff;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class EarthPick extends ItemPickaxe{
	
	public EarthPick(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("earth_pick");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:earth_pick");
	}

}
