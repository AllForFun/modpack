package com.allforfunmc.creeperore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Code {
	public static Block CreeperOre = new CreeperOre(Material.rock);
	public static void Blocks() {
		GameRegistry.registerBlock(CreeperOre, "CreeperOre");
	}
	public static void Crafting() {
		//Shapeless Recipes
		
		//Shaped Recipes
		
	}
	public static void Smelting() {
		
	}
	public static void Enchantments() {
		
	}
	public static void Items() {
	}
}
