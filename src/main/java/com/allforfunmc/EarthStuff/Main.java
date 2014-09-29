package com.allforfunmc.EarthStuff;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import com.allforfunmc.allforfuncore.Core;
import com.allforfunmc.allforfuncore.TemplateAxe;
import com.allforfunmc.allforfuncore.TemplatePick;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod (modid="EarthStuff", name="AllForFun's EarthStuff", version="1")
public class Main {
	@Instance (value="GenericModID")
	public static Main instance;
	@SidedProxy(clientSide="com.allforfunmc.EarthStuff.ClientProxy",serverSide="com.allforfunmc.EarthStuff.CommonProxy")
	public static CommonProxy proxy;
	@EventHandler()
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		GameRegistry.registerItem(EarthGem, "earth_gem");
		GameRegistry.registerItem(EarthSword, "earth_sword");
		GameRegistry.registerItem(EarthPickaxe, "earth_pickaxe");
		GameRegistry.registerItem(EarthHoe, "earth_hoe");
	}
	
	public static Item EarthGem = (new Item()).setUnlocalizedName("earth_gem").setCreativeTab(Core.AllForFunItems).setTextureName("sleshymod:earth_gem");
	
	public static Item.ToolMaterial EarthMat = EnumHelper.addToolMaterial("earth_material", 3, 3000, 15f, 15f, 30);
	
	public static Item EarthSword = (new ItemSword(EarthMat)).setMaxStackSize(1).setUnlocalizedName("earth_sword").setCreativeTab(Core.AllForFunTools).setTextureName("sleshymod:earth_sword");
	public static Item EarthPickaxe = (new TemplatePick(EarthMat)).setUnlocalizedName("earth_pick").setTextureName("sleshymod:earth_pick");
	public static Item EarthHoe = (new ItemHoe(EarthMat)).setMaxStackSize(1).setUnlocalizedName("earth_hoe").setCreativeTab(Core.AllForFunTools).setTextureName("sleshymod:earth_hoe");
	public static Item EarthAxe = (new TemplateAxe(EarthMat)).setMaxStackSize(1).setUnlocalizedName("earth_axe").setCreativeTab(Core.AllForFunTools).setTextureName("sleshymod:earth_axe");
	
	public static Block EarthBlock = new EarthBlock(Material.ground);
	public static Block EarthOre = new EarthOre(Material.rock);
	
	@EventHandler()
	public void postInit(FMLInitializationEvent event){
		
		
		
		
	}
}