package com.allforfunmc.allforfuncore;

import java.util.HashMap;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class Crafting {
	public static Object armor(int slot, Item material){
		Object crafting = null;
		switch(slot){
		case 0:
			crafting = new Object[]{
				"xxx",
				"x x",
				'x', material
				};
		case 1:
			crafting = new Object[]{
				"x x",
				"xxx",
				"xxx",
				'x', material
			};
		case 2:
			crafting = new Object[]{
				"xxx",
				"x x",
				"x x",
				'x', material
			};
		case 3:
			crafting = new Object[]{
				"x x",
				"x x",
				'x', material
			};
		}
		return crafting;
	}
	public static Object Pickaxe(Item material){
		Object crafting = new Object[]{
				"xxx",
				" | ",
				" | ",
				'x', material, "l", Items.stick
		};
		return crafting;
	}
	public static Object Axe(Item material){
		Object crafting = new Object[]{
				"xx ",
				"x| ",
				" | ",
				'x', material, "l", Items.stick
		};
		return crafting;
	}
	public static Object Spade(Item material){
		Object crafting = new Object[]{
				" x ",
				" | ",
				" | ",
				'x', material, "l", Items.stick
		};
		return crafting;
	}
	public static Object Sword(Item material){
		Object crafting = new Object[]{
				" x ",
				" x ",
				" | ",
				'x', material, "l", Items.stick
		};
		return crafting;
	}
	/**
	 * Just pass in the params to create an item of that type's crafting
	 * 
	 * @param Pickaxe, Axe, Shovel or Sword
	 * @param Item to make output
	 * @param Output
	 */
	public static void smartRegister(String type, Item material, Item output){
		if(type == "Pickaxe"){
			GameRegistry.addRecipe(new ItemStack(output), Pickaxe(material));
		}else if (type == "Axe"){
			GameRegistry.addRecipe(new ItemStack(output), Axe(material));
		}else if (type == "Shovel"){
			GameRegistry.addRecipe(new ItemStack(output), Spade(material));
		}else if (type == "Sword"){
			GameRegistry.addRecipe(new ItemStack(output), Sword(material));
		}else{
			throw (new java.lang.IndexOutOfBoundsException("Cannot create type " + type));
		}
	}
	/**
	 * Create crafting recipes from both
	 * 9 items to 1 block
	 * and 1 block to 9 items
	 * 
	 * @param Block
	 * @param Item
	 */
	public static void smartRegister(Block block, Item item){
		GameRegistry.addShapelessRecipe(new ItemStack(block), new ItemStack(item,9));
		GameRegistry.addShapelessRecipe(new ItemStack(item,9), block);
	}
	/**Registers a full set of armor at once
	 * 
	 * @param Item[] of armor pieces (helment, chestplate, leggings, boots)
	 * @param Armor Material
	 */
	public static void smartRegister(Item[] Pieces,Item material){
		GameRegistry.addRecipe(new ItemStack(Pieces[0]), armor(0, material));
		GameRegistry.addRecipe(new ItemStack(Pieces[1]), armor(1, material));
		GameRegistry.addRecipe(new ItemStack(Pieces[2]), armor(2, material));
		GameRegistry.addRecipe(new ItemStack(Pieces[3]), armor(3, material));
	}
}
