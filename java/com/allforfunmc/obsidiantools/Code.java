package com.allforfunmc.obsidiantools;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class Code {
	public static Item obsidianpickaxe;
	public static void Blocks() {
		
	}
	public static void Items() {
		ToolMaterial Obsidian = EnumHelper.addToolMaterial("Obsidion", 2, 1999, 4F, 9, 0);
		
		obsidianpickaxe = new ObsidianPickaxe(Obsidian);
		GameRegistry.registerItem(obsidianpickaxe, "ObsidionPickaxe");
		
		
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
