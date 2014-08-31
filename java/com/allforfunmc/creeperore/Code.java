package com.allforfunmc.creeperore;

import com.allforfunmc.chocolatestuff.chocolatemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
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
	public static Item CreeperPearl = new CreeperPearl();
	public static Item CreeperOnTheGo = new CreeperOnTheGo();
	public static Generator Generator = new Generator();
	public static Block MineMaker = new MineMaker(Material.rock);
	public static void Blocks() {
		GameRegistry.registerBlock(CreeperOre, "CreeperOre");
		GameRegistry.registerWorldGenerator(Generator, 20);
		GameRegistry.registerBlock(MineMaker, "MineMaker");
		
	}
	public static void Items() {
		GameRegistry.registerItem(CreeperPick, "Creeper Pick");
		GameRegistry.registerItem(CreeperPearl, "Creeper Pearl");
		GameRegistry.registerItem(CreeperOnTheGo, "Creeper On The Go");
	}
	public static void Crafting() {
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(CreeperPearl,2), new Object[]{
			Items.ender_pearl,
			Blocks.tnt
		});
		//Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(CreeperOnTheGo,4), new Object[]{
			"pt",
			"tp",
			'p', CreeperPearl, 't', Blocks.tnt
		});
		GameRegistry.addRecipe(new ItemStack(CreeperPick), new Object[]{
			"ccc",
			"cpc",
			"ccc",
			'c', CreeperOnTheGo,'p', Items.diamond_pickaxe
		});
	}
	public static void Smelting() {
		
	}
	public static void Enchantments() {
		
	}
}
