package com.allforfunmc.darkglass;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid =  Main.modid, version = Main.version)
public class Main {

	public static final String modid = "darkglass";
	public static final String version = "1.0.0";
	
	public static BlockBreakable blockDarkGlass;
	public static BlockBreakable blockClearGlass;
	public static BlockBreakable blockBrightGlass;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
	
		//blocks
		blockDarkGlass = (BlockBreakable) new DarkGlass(Material.glass, false).setBlockName("DarkGlass").setLightOpacity(1000000);
		GameRegistry.registerBlock(blockDarkGlass, "DarkGlass");
		
		blockClearGlass = (BlockBreakable) new DarkGlass(Material.glass, false).setBlockName("ClearGlass").setLightOpacity(0);
		GameRegistry.registerBlock(blockClearGlass, "ClearGlass");
		
		blockBrightGlass = (BlockBreakable) new DarkGlass(Material.glass, false).setBlockName("BrightGlass").setLightLevel(0.8F);
		GameRegistry.registerBlock(blockBrightGlass, "BrightGlass");
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent Event){
		
		//smelting
		GameRegistry.addSmelting(Blocks.glass, new ItemStack(blockClearGlass), 0);
		
		//crafting
		GameRegistry.addShapelessRecipe(new ItemStack(blockDarkGlass, 1), new Object[]{Items.flint, blockClearGlass});
		GameRegistry.addShapelessRecipe(new ItemStack(blockBrightGlass, 1), new Object[]{Items.glowstone_dust, blockClearGlass});
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
}
