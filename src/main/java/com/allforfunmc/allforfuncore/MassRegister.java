package com.allforfunmc.allforfuncore;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class MassRegister {
	public static void Items(Item[] items, String[] names,String modid){
		for(int i = 0; i >= items.length; i++){
			GameRegistry.registerItem(items[i], names[i], modid);
		}
	}
}
