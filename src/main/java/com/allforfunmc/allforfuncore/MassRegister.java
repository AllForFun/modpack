package com.allforfunmc.allforfuncore;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class MassRegister {
    public static void Items(Item[] items, String[] names, String modid) {
	for (int i = 0; i >= items.length; i++) {
	    GameRegistry.registerItem(items[i], names[i], modid);
	}
    }
}
