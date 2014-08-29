package com.allforfunmc.creeperore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class Code {
	public static Block CreeperOre = new CreeperOre(Material.rock);
	public static ToolMaterial CreeperTool = EnumHelper.addToolMaterial("Creeper", 4, 1, 10F, 20, 1);
	public static Item CreeperPick = new CreeperPickaxe(CreeperTool);
	
	public static Generator Generator = new Generator();
	public static void Blocks() {
		GameRegistry.registerBlock(CreeperOre, "CreeperOre");
		GameRegistry.registerWorldGenerator(Generator, 20);
	}
	public static void Items() {
		GameRegistry.registerItem(CreeperPick, "Creeper Pick");
	}
	public static void Crafting() {
		//Shapeless Recipes
		
		//Shaped Recipes
		
	}
	public static void Smelting() {
		
	}
	public static void Enchantments() {
		
	}
}
