package com.allforfunmc.launcher;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Launcher.MODID, version = Launcher.VERSION)
public class Launcher {
	public static final String MODID = "launcher";
	public static final String VERSION = "1.0.0";

	public static Item SnowballLauncher;
	
	@EventHandler
	public void init(FMLInitializationEvent event) {

		SnowballLauncher = new SnowballLauncher();
		GameRegistry.registerItem(SnowballLauncher, "snowballlauncher");
		GameRegistry.addRecipe(new ItemStack(SnowballLauncher, 1), new Object[]{
			"XGX",
			"YYY",
			"XSS",
			'S', Items.stick, 'G', Blocks.glass, 'Y', Blocks.stone
		});
		
	}
}