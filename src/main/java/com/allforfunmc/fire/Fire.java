package com.allforfunmc.fire;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import com.allforfunmc.allforfuncore.Core;
import com.allforfunmc.allforfuncore.Crafting;
import com.allforfunmc.allforfuncore.MassRegister;
import com.allforfunmc.allforfuncore.TemplateAxe;
import com.allforfunmc.allforfuncore.TemplatePick;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod (modid="fire", name="AllForFun's Fire", version="1")
public class Fire {
	@Instance (value="GenericModID")
	public static Fire instance;
	@SidedProxy(clientSide="com.allforfunmc.fire.ClientProxy",serverSide="com.allforfunmc.fire.CommonProxy")
	public static CommonProxy proxy;
	
	public static ToolMaterial FireMaterial = EnumHelper.addToolMaterial("fire_material", 3, 450, 20f, 20f, 30);
	public static ArmorMaterial FireArmorMat = EnumHelper.addArmorMaterial("Fire_Material", 450, new int[]{6, 10, 9, 5}, 30);
	
	public static Item FireCrystal = (new Item()).setUnlocalizedName("fire_crystal").setCreativeTab(Core.AllForFunTools).setTextureName("sleshymod:fire_crystal");
	
	public static Item FireAxe = (new TemplateAxe(FireMaterial)).setUnlocalizedName("fireaxe").setTextureName("sleshymod:fire_axe");
	public static Item FireHoe = (new ItemHoe(FireMaterial)).setMaxStackSize(1).setUnlocalizedName("fire_hoe").setCreativeTab(Core.AllForFunTools).setTextureName("sleshymod:fire_hoe");
	public static Item FirePick = (new TemplatePick(FireMaterial));
	public static Item FireSword = (new ItemSword(FireMaterial)).setMaxStackSize(1).setUnlocalizedName("fire_shovel").setCreativeTab(Core.AllForFunTools).setTextureName("fire_shovel");
	public static Item FireShovel = (new ItemSpade(FireMaterial).setMaxStackSize(1).setUnlocalizedName("fire_shovel").setCreativeTab(Core.AllForFunTools).setTextureName("sleshymod:fire_shovel"));
	
	public static Block FireBlock = new FireBlock(Material.rock);
	public static Block FireOre = new FireOre(Material.rock);
	
	public static Item FireArmorTop = (new FlameArmor(FireArmorMat, 0));
	public static Item FireArmorChest = (new FlameArmor(FireArmorMat, 0));
	public static Item FireArmorLegs = (new FlameArmor(FireArmorMat, 0));
	public static Item FireArmorFeet = (new FlameArmor(FireArmorMat, 0));
	
	@EventHandler()
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		MassRegister.Items(new Item[]
				{FireAxe,FireHoe,FirePick,FireCrystal,FireSword,FireShovel,FireArmorTop,FireArmorChest,FireArmorLegs,FireArmorFeet}, new String[]{
				"fire_axe","fire_hoe","fire_pick","fire_crystal","fire_sword","fire_shovel","fire_armor_helmet", "fire_armor_chestplate", "fire_armor_leggings", "fire_armor_boots"}, "fire");
		
	}	
	@EventHandler()
	public void postInit(FMLInitializationEvent event){
		Crafting.smartRegister("Axe", FireCrystal, FireAxe);
	}
}