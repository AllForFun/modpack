package com.allforfunmc.fire;

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
		GameRegistry.addRecipe(new ItemStack(Blocks.fire), new Object[] {
			"F ",
			"S ",
			'F', Items.flint_and_steel, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.fire, 2), new Object[] {
			"F ",
			"S ",
			'F', Blocks.fire, 'S', Items.stick
		});
	}
	public static void Smelting() {
		
	}
	public static void Enchantments() {
		
	}
	public static void Items() {
	}
}
