package com.allforfunmc.EarthStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import com.allforfunmc.allforfuncore.Core;
import com.allforfunmc.allforfuncore.Crafting;
import com.allforfunmc.allforfuncore.TemplateAxe;
import com.allforfunmc.allforfuncore.TemplatePick;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "EarthStuff", name = "AllForFun's EarthStuff", version = "1")
public class Main {
    @Instance(value = "GenericModID")
    public static Main instance;
    @SidedProxy(clientSide = "com.allforfunmc.EarthStuff.ClientProxy", serverSide = "com.allforfunmc.EarthStuff.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler()
    public void load(FMLInitializationEvent event) {
	proxy.registerRenderers();

	// Register Items
	GameRegistry.registerItem(EarthGem, "earth_gem");
	GameRegistry.registerItem(EarthSword, "earth_sword");
	GameRegistry.registerItem(EarthPickaxe, "earth_pickaxe");
	GameRegistry.registerItem(EarthHoe, "earth_hoe");
	GameRegistry.registerItem(EarthAxe, "earth_axe");
	GameRegistry.registerItem(EArmorH, "earth_hat");
	GameRegistry.registerItem(EArmorC, "earth_chestplate");
	GameRegistry.registerItem(EArmorL, "earth_leggings");
	GameRegistry.registerItem(EArmorB, "earth_boots");
	// Register Blocks
	GameRegistry.registerBlock(EarthBlock, "Earth_Block");
	GameRegistry.registerBlock(EarthOre, "Earth_Ore");
	// Register Item
	Crafting.smartRegisterArmor(new Item[] { EArmorH, EArmorC, EArmorL, EArmorB }, EarthGem);
    }

    public static Item EarthGem = (new Item()).setUnlocalizedName("earth_gem").setCreativeTab(Core.AllForFunItems).setTextureName("sleshymod:earth_gem");

    public static Item.ToolMaterial EarthMat = EnumHelper.addToolMaterial("earth_material", 3, 3000, 15f, 15f, 30);
    public static ArmorMaterial EarthArmorMat = EnumHelper.addArmorMaterial("myArmorMaterial", 3000, new int[] { 7, 13, 12, 6 }, 30);

    public static Item EarthSword = (new ItemSword(EarthMat)).setMaxStackSize(1).setUnlocalizedName("earth_sword").setCreativeTab(Core.AllForFunTools).setTextureName("sleshymod:earth_sword");
    public static Item EarthPickaxe = (new TemplatePick(EarthMat)).setUnlocalizedName("earth_pick").setTextureName("sleshymod:earth_pick");
    public static Item EarthHoe = (new ItemHoe(EarthMat)).setMaxStackSize(1).setUnlocalizedName("earth_hoe").setCreativeTab(Core.AllForFunTools).setTextureName("sleshymod:earth_hoe");
    public static Item EarthAxe = (new TemplateAxe(EarthMat)).setMaxStackSize(1).setUnlocalizedName("earth_axe").setCreativeTab(Core.AllForFunTools).setTextureName("sleshymod:earth_axe");

    public static Item EArmorH = new EarthArmor(EarthArmorMat, Core.NullID, 0);
    public static Item EArmorC = new EarthArmor(EarthArmorMat, Core.NullID, 1);
    public static Item EArmorL = new EarthArmor(EarthArmorMat, Core.NullID, 2);
    public static Item EArmorB = new EarthArmor(EarthArmorMat, Core.NullID, 3);

    public static Block EarthBlock = new EarthBlock(Material.ground);
    public static Block EarthOre = new EarthOre(Material.rock);

    @EventHandler()
    public void postInit(FMLInitializationEvent event) {
	// Shapeless
	GameRegistry.addShapelessRecipe(new ItemStack(EarthBlock), new ItemStack(EarthGem, 9));
	GameRegistry.addShapelessRecipe(new ItemStack(EarthGem, 9), new ItemStack(EarthBlock));
	// Smelting
	GameRegistry.addSmelting(EarthOre, new ItemStack(EarthGem), 3F);
    }
}