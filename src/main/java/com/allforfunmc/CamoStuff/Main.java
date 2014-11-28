package com.allforfunmc.CamoStuff;

import com.allforfunmc.CamoStuff.camochest.CamoChest;
import com.allforfunmc.CamoStuff.camochest.TileEntityCamo;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import com.allforfunmc.allforfuncore.Core;
import com.allforfunmc.allforfuncore.Crafting;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "camostuff", name = "AllForFun's CamoStuff", version = "1")
public class Main {
    @Instance(value = "GenericModID")
    public static Main instance;
    @SidedProxy(clientSide = "com.allforfunmc.CamoStuff.ClientProxy", serverSide = "com.allforfunmc.CamoStuff.CommonProxy")
    public static CommonProxy proxy;

    // Materials
    public static ToolMaterial camoMat = EnumHelper.addToolMaterial("camo_material", 3, 3000, 15f, 15f, 30);
    public static ArmorMaterial camoArmorMat = EnumHelper.addArmorMaterial("camo_armor_material", 100, new int[] { 3, 6, 5, 2 }, 30);
    // Items
    public static Item CamoApple = new CamoApple(2, 2, false);
    public static Item CamoArmorHat = new CamoArmor(camoArmorMat, Core.NullID, 0);
    public static Item CamoArmorShirt = new CamoArmor(camoArmorMat, Core.NullID, 1);
    public static Item CamoArmorPants = new CamoArmor(camoArmorMat, Core.NullID, 2);
    public static Item CamoArmorShoes = new CamoArmor(camoArmorMat, Core.NullID, 3);
    public static Item CamoAxe = new CamoAxe(camoMat);
    public static Item CamoSword = new CamoSword(camoMat);
    // Simple Items
    public static Item CamoGem = (new Item()).setUnlocalizedName("camo_gem").setCreativeTab(Core.AllForFunItems).setTextureName("sleshymod:camo_gem");
    // Blocks
    public Block CamoBlock = new CamoBlock(Material.rock);
    public static Block CamoOre = new CamoOre(Material.rock);
    public static Block CamoChest = new CamoChest();

    @EventHandler()
    public void load(FMLInitializationEvent event) {
	proxy.registerRenderers();
	// Blocks
	GameRegistry.registerBlock(CamoBlock, "camo_block");
	GameRegistry.registerBlock(CamoOre, "camo_ore");
	// Items
	GameRegistry.registerItem(CamoArmorHat, "camo_helmet");
	GameRegistry.registerItem(CamoArmorShirt, "camo_chestplate");
	GameRegistry.registerItem(CamoArmorPants, "camo_leggings");
	GameRegistry.registerItem(CamoArmorShoes, "camo_boots");
	GameRegistry.registerItem(CamoAxe, "camo_axe");
	GameRegistry.registerItem(CamoApple, "camo_apple");
	GameRegistry.registerItem(CamoSword, "camo_sword");

    }
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent event)
    {
        CamoChest.setCreativeTab(Core.AllForFunBlocks).setBlockName("camo_chest");
        GameRegistry.registerBlock(CamoChest, "camo_chest");

        TileEntityCamo.MainRegistry();

    }
    @EventHandler()
    public void postInit(FMLInitializationEvent event) {

	// Crafting
	// Shaped
	Crafting.smartRegisterArmor(new Item[] { CamoArmorHat, CamoArmorShirt, CamoArmorPants, CamoArmorShoes }, CamoGem);
	Crafting.smartRegisterTool("Axe", CamoGem, CamoAxe);
	// Smelting
	GameRegistry.addSmelting(CamoOre, new ItemStack(CamoGem), 1F);
	// Shapeless
	Crafting.smartRegisterBlock(CamoBlock, CamoGem);
    }
}