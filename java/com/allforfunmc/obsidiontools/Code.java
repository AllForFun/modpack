package com.allforfunmc.obsidiontools;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class Code {
	public static Item obsidionpickaxe;
	public static void Blocks() {
		
	}
	public static void Items() {
		ToolMaterial Obsidion = EnumHelper.addToolMaterial("Obsidion", 2, 10000, 4F, 9, 0);
		
		obsidionpickaxe = new ObsidionPickaxe(Obsidion);
		GameRegistry.registerItem(obsidionpickaxe, "ObsidionPickaxe");
		
		
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
