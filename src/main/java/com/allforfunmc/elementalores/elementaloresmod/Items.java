package com.elementalores.elementaloresmod;

import com.elementalores.blocks.CamoBlock;
import com.elementalores.blocks.CamoOre;
import com.elementalores.blocks.EarthBlock;
import com.elementalores.blocks.EarthOre;
import com.elementalores.blocks.FireBlock;
import com.elementalores.blocks.FireOre;
import com.elementalores.blocks.IceBlock;
import com.elementalores.blocks.IceOre;
import com.elementalores.blocks.LightningBlock;
import com.elementalores.blocks.LightningOre;
import com.elementalores.items.CamoApple;
import com.elementalores.items.CamoArmor;
import com.elementalores.items.CamoAxe;
import com.elementalores.items.CamoGem;
import com.elementalores.items.CamoSword;
import com.elementalores.items.EarthArmor;
import com.elementalores.items.EarthAxe;
import com.elementalores.items.EarthGem;
import com.elementalores.items.EarthHoe;
import com.elementalores.items.EarthPick;
import com.elementalores.items.EarthShovel;
import com.elementalores.items.EarthSword;
import com.elementalores.items.FireAxe;
import com.elementalores.items.FireCrystal;
import com.elementalores.items.FireHoe;
import com.elementalores.items.FirePick;
import com.elementalores.items.FireShovel;
import com.elementalores.items.FireSword;
import com.elementalores.items.FlameArmor;
import com.elementalores.items.IceArmor;
import com.elementalores.items.IceAxe;
import com.elementalores.items.IceCrystal;
import com.elementalores.items.IceHoe;
import com.elementalores.items.IcePick;
import com.elementalores.items.IceShovel;
import com.elementalores.items.IceSword;
import com.elementalores.items.LightningArmor;
import com.elementalores.items.LightningAxe;
import com.elementalores.items.LightningCrystal;
import com.elementalores.items.LightningHoe;
import com.elementalores.items.LightningPick;
import com.elementalores.items.LightningShovel;
import com.elementalores.items.LightningSword;
import com.elementalores.oregenerators.CamoOreGenerator;
import com.elementalores.oregenerators.EarthOreGenerator;
import com.elementalores.oregenerators.FireOreGenerator;
import com.elementalores.oregenerators.IceOreGenerator;
import com.elementalores.oregenerators.LightningOreGenerator;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Items {
	
	//the tool material
	public static ToolMaterial fireMaterial;
	public static ToolMaterial iceMaterial;
	public static ToolMaterial earthMaterial;
	public static ToolMaterial lightningMaterial;
	public static ToolMaterial camoMaterial;
	// armour material
	public static ArmorMaterial myArmorMaterial;
	
	public static void MainRegistry(){
		InitItems();
		RegisterItems();
		
	}


    //Ingot registries
    public static Item firecrystal;

	public static Item icecrystal;

	public static Item earthgem;

	public static Item lightningcrystal;

	public static Item camogem;

	//Item registries
		//picks
	public static Item firepick;

	public static Item icepick;

	public static Item earthpick;

	public static Item lightningpick;

		//shovels
	public static Item lightningshovel;

	public static Item fireshovel;

	public static Item iceshovel;

	public static Item earthshovel;

		//swords
	public static Item lightningsword;

	public static Item firesword;

	public static Item icesword;

	public static Item earthsword;

	public static Item camosword;
	int camoswordID = 526;
	
		//axes
	public static Item lightningaxe;

	public static Item fireaxe;

	public static Item iceaxe;

	public static Item earthaxe;

	public static Item camoaxe;

		//hoes
	public static Item lightninghoe;

	public static Item firehoe;

	public static Item icehoe;

	public static Item earthhoe;

    //food
    public static Item camoapple;
    
    //Armour
    public static Item FlameHelmet;
    public static Item FlamePlate;
    public static Item FlameLegs;
    public static Item FlameBoots;
    public static int helmid;
    public static int chestid;
    public static int legid;
    public static int bootid;
    
    public static Item IceHelmet;
    public static Item IcePlate;
    public static Item IceLegs;
    public static Item IceBoots;
    public static int helmid2;
    public static int chestid2;
    public static int legid2;
    public static int bootid2;
    
    public static Item CamoHelmet;
    public static Item CamoPlate;
    public static Item CamoLegs;
    public static Item CamoBoots;
    public static int helmid3;
    public static int chestid3;
    public static int legid3;
    public static int bootid3;
    
    public static Item EarthHelmet;
    public static Item EarthPlate;
    public static Item EarthLegs;
	public static Item EarthBoots;
    public static int helmid4;
    public static int chestid4;
    public static int legid4;
    public static int bootid4;
    
    public static Item LightningHelmet;
    public static Item LightningPlate;
    public static Item LightningLegs;
    public static Item LightningBoots;
    public static int helmid5;
    public static int chestid5;
    public static int legid5;
    public static int bootid5;
    
    public static CreativeTabs moditemsTab = new CreativeTabs("modItems"){
    	public Item getTabIconItem(){
    		return firecrystal;
    	}
    };
    
    public static IWorldGenerator fireGen;
    public static IWorldGenerator iceGen;
    public static IWorldGenerator earthGen;
    public static IWorldGenerator camoGen;
    public static IWorldGenerator lightningGen;
    
    public static void InitItems(){
		
		
		
		firecrystal = new FireCrystal();
		icecrystal = new IceCrystal();
		earthgem = new EarthGem();
		lightningcrystal = new LightningCrystal();
		camogem = new CamoGem();
		
		
     	fireMaterial = EnumHelper.addToolMaterial("fire_material", 3, 2000, 20f, 5f, 5);
     	firepick = new FirePick(fireMaterial);
 	
     	fireMaterial = EnumHelper.addToolMaterial("fire_material", 3, 2000, 0f, 25f, 5);
     	firesword = new FireSword(fireMaterial);
 	
     	fireMaterial = EnumHelper.addToolMaterial("fire_material", 3, 2000, 20f, 20f, 5);
     	fireaxe = new FireAxe(fireMaterial);
	
     	
     	fireMaterial = EnumHelper.addToolMaterial("fire_material", 3, 2000, 20f, 5f, 5);
     	fireshovel = new FireShovel(fireMaterial);
	
     	fireMaterial = EnumHelper.addToolMaterial("fire_material", 3, 2000, 20f, 5f, 5);
     	firehoe = new FireHoe(fireMaterial);
	
     	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 5);
     	icepick = new IcePick(iceMaterial);
	
     	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 0f, 22.5f, 5);
     	icesword = new IceSword(iceMaterial);
	
     	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 5);
     	iceaxe = new IceAxe(iceMaterial);
	
     	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 5);
     	iceshovel = new IceShovel(iceMaterial);
	
     	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 5);
     	icehoe = new IceHoe(iceMaterial);
	
     	earthMaterial = EnumHelper.addToolMaterial("earth_material", 3, 3000, 15f, 5f, 5);
     	earthpick = new EarthPick(earthMaterial);
     	
     	earthMaterial = EnumHelper.addToolMaterial("earth_material", 3, 3000, 0f, 30f, 5);
    	earthsword = new EarthSword(earthMaterial);
     	
    	earthMaterial = EnumHelper.addToolMaterial("earth_material", 3, 3000, 15f, 15f, 5);
    	earthaxe = new EarthAxe(earthMaterial);
    	
    	earthMaterial = EnumHelper.addToolMaterial("earth_material", 3, 3000, 15f, 5f, 5);
    	earthshovel = new EarthShovel(earthMaterial);
    	
    	earthMaterial = EnumHelper.addToolMaterial("earth_material", 3, 3000, 15f, 5f, 5);
    	earthhoe = new EarthHoe(earthMaterial);
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 30f, 5f, 5);
    	lightningpick = new LightningPick(lightningMaterial);
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 0f, 35f, 5);
    	lightningsword = new LightningSword(lightningMaterial);
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 30f, 30f, 5);
    	lightningaxe = new LightningAxe(lightningMaterial);
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 30f, 5f, 5);
    	lightningshovel = new LightningShovel(lightningMaterial);
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 30f, 5f, 5);
    	lightninghoe = new LightningHoe(lightningMaterial);
    	
    	camoMaterial = EnumHelper.addToolMaterial("camo_material", 3, 1000, 0f, 15f, 5);
    	camosword = new CamoSword(camoMaterial);

    	camoMaterial = EnumHelper.addToolMaterial("camo_material", 3, 1000, 15f, 20f, 5);
    	camoaxe = new CamoAxe(camoMaterial);
    	
    	camoapple = new CamoApple(2, 2, false);
    	
		myArmorMaterial = EnumHelper.addArmorMaterial("myArmorMaterial", 1500, new int[]{7, 9, 8, 6}, 5);
     	//(name, durability, damageReductionAmounts, enchantability)
     	LightningHelmet = new LightningArmor(myArmorMaterial, helmid5, 0).setUnlocalizedName("Lightning_helmet");
     	LightningPlate = new LightningArmor(myArmorMaterial, chestid5, 1).setUnlocalizedName("Lightning_chestplate");
     	LightningLegs = new LightningArmor(myArmorMaterial, legid5, 2).setUnlocalizedName("Lightning_leggings");
     	LightningBoots = new LightningArmor(myArmorMaterial, bootid5, 3).setUnlocalizedName("Lightning_boots");
     	 myArmorMaterial = EnumHelper.addArmorMaterial("myArmorMaterial", 3000, new int[]{6, 8, 7, 5}, 5);
     	 
     	 //(name, durability, damageReductionAmounts, enchantability)
     	 EarthHelmet = new EarthArmor(myArmorMaterial, helmid4, 0).setUnlocalizedName("Earth_helmet");
     	 EarthPlate = new EarthArmor(myArmorMaterial, chestid4, 1).setUnlocalizedName("Earth_chestplate");
     	 EarthLegs = new EarthArmor(myArmorMaterial, legid4, 2).setUnlocalizedName("Earth_leggings");
     	 EarthBoots = new EarthArmor(myArmorMaterial, bootid4, 3).setUnlocalizedName("Earth_boots");
     	
     	myArmorMaterial = EnumHelper.addArmorMaterial("myArmorMaterial", 100, new int[]{2, 6, 5, 2}, 5);
     	//(name, durability, damageReductionAmounts, enchantability)
     	CamoHelmet = new CamoArmor(myArmorMaterial, helmid3, 0).setUnlocalizedName("Camo_helmet");
     	CamoPlate = new CamoArmor(myArmorMaterial, chestid3, 1).setUnlocalizedName("Camo_chestplate");
     	CamoLegs = new CamoArmor(myArmorMaterial, legid3, 2).setUnlocalizedName("Camo_leggings");
     	CamoBoots = new CamoArmor(myArmorMaterial, bootid3, 3).setUnlocalizedName("Camo_boots");
     	
     	myArmorMaterial = EnumHelper.addArmorMaterial("myArmorMaterial", 2000, new int[]{4, 8, 7, 3}, 5);
     	//(name, durability, damageReductionAmounts, enchantability)
     	IceHelmet = new IceArmor(myArmorMaterial, helmid2, 0).setUnlocalizedName("Ice_helmet");
     	IcePlate = new IceArmor(myArmorMaterial, chestid2, 1).setUnlocalizedName("Ice_chestplate");
     	IceLegs = new IceArmor(myArmorMaterial, legid2, 2).setUnlocalizedName("Ice_leggings");
     	IceBoots = new IceArmor(myArmorMaterial, bootid2, 3).setUnlocalizedName("Ice_boots");
	 
     	myArmorMaterial = EnumHelper.addArmorMaterial("myArmorMaterial", 2000, new int[]{5, 9, 7, 4}, 5);
     	//(name, durability, damageReductionAmounts, enchantability)
     	FlameHelmet = new FlameArmor(myArmorMaterial, helmid, 0).setUnlocalizedName("flame_helmet");
     	FlamePlate = new FlameArmor(myArmorMaterial, chestid, 1).setUnlocalizedName("flame_chestplate");
     	FlameLegs = new FlameArmor(myArmorMaterial, legid, 2).setUnlocalizedName("flame_leggings");
     	FlameBoots = new FlameArmor(myArmorMaterial, bootid, 3).setUnlocalizedName("flame_boots");
	
     	iceGen = new IceOreGenerator();
    	fireGen = new FireOreGenerator();
    	camoGen = new CamoOreGenerator();
    	earthGen = new EarthOreGenerator();
    	lightningGen = new LightningOreGenerator();
}
    
    public static void RegisterItems(){
	
    			GameRegistry.registerItem(firecrystal, "fire_crystal");
    	    	GameRegistry.registerItem(icecrystal, "ice_crystal");
    	    	GameRegistry.registerItem(earthgem, "earth_gem");
    	    	GameRegistry.registerItem(lightningcrystal, "lightning_crystal");
    	    	GameRegistry.registerItem(camogem, "camo_gem");
    	    	
    	    	GameRegistry.registerItem(firepick, "fire_pick");
    	    	GameRegistry.registerItem(firesword, "fire_sword");
    	    	GameRegistry.registerItem(fireaxe, "fire_axe");
    	    	GameRegistry.registerItem(fireshovel, "fire_shovel");
    	    	GameRegistry.registerItem(firehoe, "fire_hoe");
    	    	GameRegistry.registerItem(icepick, "ice_pick");
    	    	GameRegistry.registerItem(icesword, "ice_sword");
    	    	GameRegistry.registerItem(iceaxe, "ice_axe");
    	    	GameRegistry.registerItem(iceshovel, "ice_shovel");
    	    	GameRegistry.registerItem(icehoe, "ice_hoe");
    	    	GameRegistry.registerItem(earthpick, "earth_pick");
    	    	GameRegistry.registerItem(earthsword, "earth_sword");
    	    	GameRegistry.registerItem(earthaxe, "earth_axe");
    	    	GameRegistry.registerItem(earthshovel, "earth_shovel");
    	    	GameRegistry.registerItem(earthhoe, "earth_hoe");	
    	    	GameRegistry.registerItem(lightningpick, "lightning_pick");
    	    	GameRegistry.registerItem(lightningsword, "lightning_sword");
    	    	GameRegistry.registerItem(lightningaxe, "lightning_axe");    	    	
    	    	GameRegistry.registerItem(lightningshovel, "lightning_shovel");
    	    	GameRegistry.registerItem(lightninghoe, "lightning_hoe");
    	    	GameRegistry.registerItem(camosword, "camo_sword");
    	    	GameRegistry.registerItem(camoaxe, "camo_axe");
    	    	
    	    	GameRegistry.registerItem(FlameHelmet, "flame_helmet");
    	    	GameRegistry.registerItem(FlamePlate, "flame_chestplate");
    	    	GameRegistry.registerItem(FlameLegs, "flame_leggings");
    	    	GameRegistry.registerItem(FlameBoots, "flame_boots");
    	    	GameRegistry.registerItem(IceHelmet, "Ice_helmet");
    	    	GameRegistry.registerItem(IcePlate, "Ice_chestplate");
    	    	GameRegistry.registerItem(IceLegs, "Ice_leggings");
    	    	GameRegistry.registerItem(IceBoots, "Ice_boots");

    	    	GameRegistry.registerItem(CamoHelmet, "Camo_helmet");
    	     	GameRegistry.registerItem(CamoPlate, "Camo_chestplate");
    	     	GameRegistry.registerItem(CamoLegs, "Camo_leggings");
    	     	GameRegistry.registerItem(CamoBoots, "Camo_boots");

    	     	GameRegistry.registerItem(EarthHelmet, "Earth_helmet");
    	     	GameRegistry.registerItem(EarthPlate, "Earth_chestplate");
    	     	GameRegistry.registerItem(EarthLegs, "Earth_leggings");
    	     	GameRegistry.registerItem(EarthBoots, "Earth_boots");
    	     	 
    	         
    	     	
    	     	GameRegistry.registerItem(LightningHelmet, "Lightning_helmet");
    	     	GameRegistry.registerItem(LightningPlate, "Lightning_chestplate");
    	     	GameRegistry.registerItem(LightningLegs, "Lightning_leggings");
    	     	GameRegistry.registerItem(LightningBoots, "Lightning_boots");
    	        GameRegistry.registerItem(camoapple, "camo_apple");
    	        
    	    	GameRegistry.registerWorldGenerator(fireGen, 1);
    	    	GameRegistry.registerWorldGenerator(iceGen, 1);
    	    	GameRegistry.registerWorldGenerator(camoGen, 1);
    	    	GameRegistry.registerWorldGenerator(earthGen, 1);
    	    	GameRegistry.registerWorldGenerator(lightningGen, 1);

	}

}
