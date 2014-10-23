package com.allforfunmc.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public class ExplodingEnchantment extends Enchantment{
	
	public ExplodingEnchantment(int id, int rarity){
		super(id, rarity, EnumEnchantmentType.armor_feet);
		this.setName("Exploding Arrows");
	}
	
	public int getMinEnchantability(int par1){
		return 5 + (par1 - 1) * 10;
	}
	
	public int getMaxEnchantability(int par1){
		return this.getMinEnchantability(par1) + 30;
	}
	
	public int getMaxLevel(){
		return 5;
	}

}
