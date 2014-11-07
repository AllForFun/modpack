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
	public static final String MODID = "Launcher";
	public static final String VERSION = "1.0.0";

	public static Item SnowballLauncher;
	public static Item EggLauncher;
	public static Item FireballLauncher;
	public static Item ArrowLauncher;
	
	@EventHandler
	public void init(FMLInitializationEvent event) {

		SnowballLauncher = new SnowballLauncher();
		GameRegistry.registerItem(SnowballLauncher, "snowballlauncher");
		GameRegistry.addRecipe(new ItemStack(SnowballLauncher, 1), new Object[]{
			"XGX",
			"YYY",
			"CSS",
			'S', Items.stick, 'G', Blocks.glass, 'Y', Blocks.stone, 'C', Items.snowball
		});
		
		EggLauncher = new EggLauncher();
		GameRegistry.registerItem(EggLauncher, "egglauncher");
		GameRegistry.addRecipe(new ItemStack(EggLauncher, 1), new Object[]{
			"XGX",
			"YYY",
			"CSS",
			'S', Items.stick, 'G', Blocks.glass, 'Y', Blocks.stone, 'C', Items.egg
		});
		
		FireballLauncher = new FireballLauncher();
		GameRegistry.registerItem(FireballLauncher, "fireballlauncher");
		//GameRegistry.addRecipe(new ItemStack(FireballLauncher, 1), new Object[]{
			//"XGX",
			//"YYY",
			//"CSS",
			//'S', Items.stick, 'G', Blocks.glass, 'Y', Blocks.stone, 'C', Items.flint_and_steel
		//});
		
		ArrowLauncher = new ArrowLauncher();
		GameRegistry.registerItem(ArrowLauncher, "arrowlauncher");
		GameRegistry.addRecipe(new ItemStack(ArrowLauncher, 1), new Object[]{
			"XGX",
			"YYY",
			"CSS",
			'S', Items.stick, 'G', Blocks.glass, 'Y', Blocks.stone, 'C', Items.arrow
		});
		
		
	}
}