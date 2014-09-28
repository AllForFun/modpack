package com.allforfunmc.LightningMod;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class LightningPick extends ItemPickaxe{
	
	public LightningPick(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("lightning_pick");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:lightning_pick");
	}

}
