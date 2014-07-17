package com.allforfunmc.getwoodback;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Code {
	public static void Crafting() {
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.log), new ItemStack(Blocks.crafting_table));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sapling), new ItemStack(Blocks.leaves));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.stick,5), new ItemStack(Blocks.sapling));
		//Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(Blocks.planks), new Object[]{
			"   ",
			" B ",
			" B ",
			'B', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.planks), new Object[]{
			"B ",
			"B ",
			'B', Items.stick
		});
	}
	public static void Smelting() {
		GameRegistry.addSmelting(new ItemStack(Items.coal, 1, 1), new ItemStack(Blocks.log), -1);
	}
	public static void Enchantments() {
		
	}
	public static void Items() {

	}
}
