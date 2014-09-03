package com.allforfunmc.moreoresandmore;

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

	public static final String modid = "moreoresandmore";
	public static final String version = "1.0.0";
	
	public static Block blockCompressedCobble;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
	
		//blocks
		blockCompressedCobble = new CompressedCobble(Material.rock).setBlockName("CompressedCobble").setHardness(5.0F).setResistance(2000.0F);
		GameRegistry.registerBlock(blockCompressedCobble, "CompressedCobble");
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent Event){
		
		//crafting
		GameRegistry.addShapedRecipe(new ItemStack(blockCompressedCobble, 1), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.cobblestone});
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
}
