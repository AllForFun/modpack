package com.allforfunmc.CamoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod (modid="camostuff", name="AllForFun's CamoStuff", version="1")
public class Main {
	@Instance (value="GenericModID")
	public static Main instance;
	@SidedProxy(clientSide="com.allforfunmc.CamoStuff.ClientProxy",serverSide="com.allforfunmc.CamoStuff.CommonProxy")
	public static CommonProxy proxy;
	
	//Materials
	public ToolMaterial camoMat = EnumHelper.addToolMaterial("camo_material", 3, 3000, 15f, 15f, 30);
	public ArmorMaterial camoArmorMat = EnumHelper.addArmorMaterial("camo_armor_material", 100, new int[]{3, 6, 5, 2}, 30);
	//Null Id
	public static int NullID;
	//Items
	public Item CamoApple = new CamoApple(2, 2, false);
	public Item CamoArmor = new CamoArmor(camoArmorMat, NullID, 1);
	public Item CamoAxe = new CamoAxe(camoMat);
	
	//Blocks
	public Block CamoBlock = new CamoBlock(Material.rock);
	public static Block CamoOre = new CamoOre(Material.rock);

	@EventHandler()
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
	@EventHandler()
	public void postInit(FMLInitializationEvent event){
		
		
		
		//Crafting
		//Shapeless
	}
}