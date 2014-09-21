package com.allforfunmc.lava;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Code {
	public static void Blocks() {
		
	}
	public static void Crafting() {
		//Shapeless Recipes
		
		//Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(Items.lava_bucket),new Object[]{
			"W ",
			"F ",
			'W', Items.water_bucket, 'F', Blocks.fire			
		});
	}
	public static void Smelting() {
		GameRegistry.addSmelting(new ItemStack(Items.water_bucket), new ItemStack(Items.lava_bucket),5F);
	}
	public static void Enchantments() {
		
	}
	public static void Items() {
	}
}
