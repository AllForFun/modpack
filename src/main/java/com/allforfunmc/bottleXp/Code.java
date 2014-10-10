package com.allforfunmc.bottleXp;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Code {
    public static void Blocks() {

    }

    public static void Crafting() {
	// Shapeless Recipes

	// Shaped Recipes

    }

    public static void Smelting() {
	GameRegistry.addSmelting(new ItemStack(Items.gold_nugget), new ItemStack(Items.experience_bottle), 1);
    }

    public static void Enchantments() {

    }

    public static void Items() {
    }
}
