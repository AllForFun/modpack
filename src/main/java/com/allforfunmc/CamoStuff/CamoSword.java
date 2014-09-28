package com.allforfunmc.CamoStuff;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import com.allforfunmc.allforfuncore.Core;

public class CamoSword extends ItemSword{
	
	public CamoSword(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("camo_sword");
		setCreativeTab(Core.AllForFunTools);
		this.setTextureName("sleshymod:camo_sword");
	}

}
