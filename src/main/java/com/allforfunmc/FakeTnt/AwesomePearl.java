package com.allforfunmc.FakeTnt;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AwesomePearl extends Item{
	public AwesomePearl(){
		this.setTextureName("example:awesome_pearl");
		this.setUnlocalizedName("awesome_pearl");
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
}
