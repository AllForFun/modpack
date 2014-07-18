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
	public static Item obsidianaxe;
	public static void Blocks() {
		
	}
	public static void Items() {
		ToolMaterial Obsidian = EnumHelper.addToolMaterial("Obsidian", 2, 1999, 4F, 9, 0);
		
		obsidianpickaxe = new ObsidianPickaxe(Obsidian);
		GameRegistry.registerItem(obsidianpickaxe, "ObsidianPickaxe");
		obsidianaxe = new ObsidianAxe(Obsidian);
		GameRegistry.registerItem(obsidianaxe, "ObsidianAxe");
		
		
	}
	public static void Crafting() {
		//Shapeless Recipes
		
		//Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(obsidianpickaxe), new Object[]{
			"OOO",
			" S ",
			" S ",
			'O', Blocks.obsidian, 'S', Items.stick
		}); GameRegistry.addRecipe(new ItemStack(obsidianaxe), new Object[]{
			"OO ",
			"OS ",
			" S ",
			'O', Blocks.obsidian, 'S', Items.stick
		});
	}
	public static void Smelting() {
		
	}
	public static void Enchantments() {
		
	}
}
