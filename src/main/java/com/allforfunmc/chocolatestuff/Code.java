package com.allforfunmc.chocolatestuff;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Code {
	public static Item chocolateBar;
	public static Item meltedChocolate;
	
	public static void Blocks() {
		
	}	public static void Items() {
		chocolateBar = new ChocolateBar();
		GameRegistry.registerItem(chocolateBar, "chocolateBar");
		meltedChocolate = new MeltedChocolate();
		GameRegistry.registerItem(meltedChocolate, "meltedChocolate");
	}	public static void Crafting() {
		GameRegistry.addRecipe(new ItemStack(chocolateBar,0), new Object[]{
			"scs",
			"csc",
			's', Items.sugar, 'c', meltedChocolate
		});
		GameRegistry.addRecipe(new ItemStack(chocolateBar,1), new Object[]{
			"scs",
			"cmc",
			's', Items.sugar, 'c', meltedChocolate, 'm', Items.milk_bucket}
		);
	}	public static void Smelting() {
		GameRegistry.addSmelting(new ItemStack(Items.dye,1,3), new ItemStack(meltedChocolate), 0);
	}	public static void Enchantments() {
		
	}
}
