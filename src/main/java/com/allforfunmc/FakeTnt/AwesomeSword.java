package com.allforfunmc.FakeTnt;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class AwesomeSword extends ItemSword{
	public AwesomeSword(ToolMaterial mat){
		super(mat);
		this.setTextureName("example:awesome_sword");
		this.setUnlocalizedName("awesome_sword");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}
