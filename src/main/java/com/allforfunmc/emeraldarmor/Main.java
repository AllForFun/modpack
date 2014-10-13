package com.allforfunmc.emeraldarmor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid =  Main.modid, version = Main.version, name = Main.name)
public class Main {
	
	public static final String modid = "emeraldarmor";
	public static final String version = "1.0.0";
	public static final String name = "Emerald Armor";

	public static CreativeTabs emeraldarmorTab;
	
	public static ToolMaterial EmeraldMaterial = EnumHelper.addToolMaterial("EmeraldMaterial", 3, 1800, 10.0F, 4.0F, 30);
	public static ArmorMaterial EmeraldArmorMaterial = EnumHelper.addArmorMaterial("EmeraldArmor", 15, new int[] {3, 8, 6, 3}, 30);
	
	//armor
	public static int armorEmeraldHelmetID;
	public static int armorEmeraldChestplateID;
	public static int armorEmeraldLeggingsID;
	public static int armorEmeraldBootsID;
	
	public static Item armorEmeraldHelmet;
	public static Item armorEmeraldChestplate;
	public static Item armorEmeraldLeggings;
	public static Item armorEmeraldBoots;
	
	//tools
	public static Item itemEmeraldSword;
	public static Item itemEmeraldPickaxe;
	public static Item itemEmeraldAxe;
	public static Item itemEmeraldShovel;
	public static Item itemEmeraldHoe;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
		
		//armor
		armorEmeraldHelmet = new EmeraldArmor(EmeraldArmorMaterial, armorEmeraldHelmetID, 0).setUnlocalizedName("EmeraldHelmet");
		GameRegistry.registerItem(armorEmeraldHelmet, "EmeraldHelmet");
		
		armorEmeraldChestplate = new EmeraldArmor(EmeraldArmorMaterial, armorEmeraldChestplateID, 1).setUnlocalizedName("EmeraldChestplate");
		GameRegistry.registerItem(armorEmeraldChestplate, "EmeraldChestplate");
		
		armorEmeraldLeggings = new EmeraldArmor(EmeraldArmorMaterial, armorEmeraldLeggingsID, 2).setUnlocalizedName("EmeraldLeggings");
		GameRegistry.registerItem(armorEmeraldLeggings, "EmeraldLeggings");
		
		armorEmeraldBoots = new EmeraldArmor(EmeraldArmorMaterial, armorEmeraldBootsID, 3).setUnlocalizedName("EmeraldBoots");
		GameRegistry.registerItem(armorEmeraldBoots, "EmeraldBoots");
		
		//tools
		itemEmeraldSword = new EmeraldSword(EmeraldMaterial).setUnlocalizedName("EmeraldSword");
		GameRegistry.registerItem(itemEmeraldSword, "EmeraldSword");
		
		itemEmeraldPickaxe = new EmeraldPickaxe(EmeraldMaterial).setUnlocalizedName("EmeraldPickaxe");
		GameRegistry.registerItem(itemEmeraldPickaxe, "EmeraldPickaxe");
		
		itemEmeraldAxe = new EmeraldAxe(EmeraldMaterial).setUnlocalizedName("EmeraldAxe");
		GameRegistry.registerItem(itemEmeraldAxe, "EmeraldAxe");
		
		itemEmeraldShovel = new EmeraldShovel(EmeraldMaterial).setUnlocalizedName("EmeraldShovel");
		GameRegistry.registerItem(itemEmeraldShovel, "EmeraldShovel");
		
		itemEmeraldHoe = new EmeraldHoe(EmeraldMaterial).setUnlocalizedName("EmeraldHoe");
		GameRegistry.registerItem(itemEmeraldHoe, "EmeraldHoe");
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent Event){
		
		//crafting
		GameRegistry.addShapedRecipe(new ItemStack(itemEmeraldSword), new Object[]{"X", "X", "I", 'X', Items.emerald, 'I', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(itemEmeraldPickaxe), new Object[]{"XXX", " I ", " I ", 'X', Items.emerald, 'I', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(itemEmeraldAxe), new Object[]{"XX ", "XI ", " I ", 'X', Items.emerald, 'I', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(itemEmeraldAxe), new Object[]{" XX", " IX", " I ", 'X', Items.emerald, 'I', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(itemEmeraldShovel), new Object[]{"X", "I", "I", 'X', Items.emerald, 'I', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(itemEmeraldHoe), new Object[]{"XX ", " I ", " I ", 'X', Items.emerald, 'I', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(itemEmeraldHoe), new Object[]{" XX", " I ", " I ", 'X', Items.emerald, 'I', Items.stick});
		
		GameRegistry.addShapedRecipe(new ItemStack(armorEmeraldHelmet, 1), new Object[]{"XXX", "X X", 'X', Items.emerald});
		GameRegistry.addShapedRecipe(new ItemStack(armorEmeraldChestplate, 1), new Object[]{"X X", "XXX", "XXX", 'X', Items.emerald});
		GameRegistry.addShapedRecipe(new ItemStack(armorEmeraldLeggings, 1), new Object[]{"XXX", "X X", "X X", 'X', Items.emerald});
		GameRegistry.addShapedRecipe(new ItemStack(armorEmeraldBoots, 1), new Object[]{"X X", "X X", 'X', Items.emerald});
	}

	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
}
