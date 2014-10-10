package com.allforfunmc.FireSword;

import net.minecraft.enchantment.Enchantment;
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

    }

    public static void Enchantments() {
	ItemStack fireSword = new ItemStack(Items.golden_sword, 1, 23);
	fireSword.addEnchantment(Enchantment.fireAspect, 2);
	fireSword.setStackDisplayName("Fire Sword");
	GameRegistry.addSmelting(new ItemStack(Items.diamond_sword), fireSword, 10);
    }

    public static void Items() {
    }
}
