package com.allforfunmc.chocolatestuff;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Code {
	public static Item chocolateBar;
	
	public static void Blocks() {
		
	}	public static void Items() {
		chocolateBar = new ChocolateBar(5, 5, false);
		GameRegistry.registerItem(chocolateBar, "chocolateBar");
	}	public static void Crafting() {
		//Shapeless Recipes
		
		//Shaped Recipes
		
	}	public static void Smelting() {
		
	}	public static void Enchantments() {
		
	}
}
