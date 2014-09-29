package sleshy.sleshymod;

import java.util.Random;

import sleshy.sleshymod.myblocks.CamoBlock;
import sleshy.sleshymod.myblocks.CamoOre;
import sleshy.sleshymod.myblocks.EarthBlock;
import sleshy.sleshymod.myblocks.EarthOre;
import sleshy.sleshymod.myblocks.FireBlock;
import sleshy.sleshymod.myblocks.FireOre;
import sleshy.sleshymod.myblocks.IceBlock;
import sleshy.sleshymod.myblocks.IceOre;
import sleshy.sleshymod.myblocks.LightningBlock;
import sleshy.sleshymod.myblocks.LightningOre;
import sleshy.sleshymod.myitems.CamoApple;
import sleshy.sleshymod.myitems.CamoArmor;
import sleshy.sleshymod.myitems.CamoAxe;
import sleshy.sleshymod.myitems.CamoGem;
import sleshy.sleshymod.myitems.CamoSword;
import sleshy.sleshymod.myitems.EarthArmor;
import sleshy.sleshymod.myitems.EarthAxe;
import sleshy.sleshymod.myitems.EarthGem;
import sleshy.sleshymod.myitems.EarthHoe;
import sleshy.sleshymod.myitems.EarthPick;
import sleshy.sleshymod.myitems.EarthShovel;
import sleshy.sleshymod.myitems.EarthSword;
import sleshy.sleshymod.myitems.FireAxe;
import sleshy.sleshymod.myitems.FireCrystal;
import sleshy.sleshymod.myitems.FireHoe;
import sleshy.sleshymod.myitems.FirePick;
import sleshy.sleshymod.myitems.FireShovel;
import sleshy.sleshymod.myitems.FireSword;
import sleshy.sleshymod.myitems.FlameArmor;
import sleshy.sleshymod.myitems.IceArmor;
import sleshy.sleshymod.myitems.IceAxe;
import sleshy.sleshymod.myitems.IceCrystal;
import sleshy.sleshymod.myitems.IceHoe;
import sleshy.sleshymod.myitems.IcePick;
import sleshy.sleshymod.myitems.IceShovel;
import sleshy.sleshymod.myitems.IceSword;
import sleshy.sleshymod.myitems.LightningArmor;
import sleshy.sleshymod.myitems.LightningAxe;
import sleshy.sleshymod.myitems.LightningCrystal;
import sleshy.sleshymod.myitems.LightningHoe;
import sleshy.sleshymod.myitems.LightningPick;
import sleshy.sleshymod.myitems.LightningShovel;
import sleshy.sleshymod.myitems.LightningSword;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

import java.util.Random;

import net.minecraft.entity.EntityList;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.registry.EntityRegistry;

import java.util.Random;

 	


public class MyCode {
	// item and block declaration go here
	public static Block fireOre;
	public static Block iceore;
	public static Block earthore;
	public static Block lightningore;
	public static Block camoOre;
	public static Block fireblock;
	public static Block iceblock;
	public static Block camoblock;
	public static Block earthblock;
	public static Block lightningblock;
	
	public static Item firecrystal;
	public static Item icecrystal;
	public static Item earthgem;
	public static Item lightningcrystal;
	public static Item camoGem;
	public static Item firepick;
	public static Item icepick;
	public static Item earthpick;
	public static Item lightningpick;
	public static Item lightningshovel;
	public static Item lightningsword;
	public static Item lightningaxe;
	public static Item lightninghoe;
	public static Item firehoe;
	public static Item firesword;
	public static Item fireshovel;
	public static Item fireaxe;
	public static Item iceaxe;
	public static Item icehoe;
	public static Item icesword;
	public static Item iceshovel;
	public static Item earthhoe;
	public static Item earthshovel;
	public static Item earthaxe;
	public static Item earthsword;
	public static Item camoApple;
	public static Item camoaxe;
	public static Item camosword;
	
	public static ToolMaterial fireMaterial;
    public static ToolMaterial iceMaterial;
    public static ToolMaterial earthMaterial;
    public static ToolMaterial lightningMaterial;
    public static ToolMaterial camoMaterial;
    
    public static ArmorMaterial myArmorMaterial;
    
   
    
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
    
	public static void MyBlocks(){
		//block code goes here
		
	}
	
	public static void MyRecipes(){
		//shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(icecrystal, 1),new ItemStack(iceore));
		GameRegistry.addShapelessRecipe(new ItemStack(camoApple, 1),new ItemStack(camoGem));
		GameRegistry.addShapelessRecipe(new ItemStack(camoblock, 1),new ItemStack(camoGem, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(earthblock, 1),new ItemStack(earthgem, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(iceblock, 1),new ItemStack(icecrystal, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(fireblock, 1),new ItemStack(firecrystal, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(lightningblock, 1),new ItemStack(lightningcrystal, 9));
		//shaped Recipes
		
		GameRegistry.addRecipe(new ItemStack(icepick), new Object[]{
			"AAA",
			" B ",
			" B ",
			'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(lightningpick), new Object[]{
			"AAA",
			" B ",
			" B ",
			'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(earthpick), new Object[]{
			"AAA",
			" B ",
			" B ",
			'A', new ItemStack(earthgem), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(iceshovel), new Object[]{
		"A  ",
		"B  ",
		"B  ",
		'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});

		GameRegistry.addRecipe(new ItemStack(lightningshovel), new Object[]{
		"A  ",
		"B  ",
		"B  ",
		'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

		GameRegistry.addRecipe(new ItemStack(earthshovel), new Object[]{
		"A  ",
		"B  ",
		"B  ",
		'A', new ItemStack(earthgem), 'B', new ItemStack(Items.stick)});
		
		
		GameRegistry.addRecipe(new ItemStack(iceshovel), new Object[]{
		" A ",
		" B ",
		" B ",
		'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});

		GameRegistry.addRecipe(new ItemStack(lightningshovel), new Object[]{
		" A ",
		" B ",
		" B ",
		'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

		GameRegistry.addRecipe(new ItemStack(earthshovel), new Object[]{
		" A ",
		" B ",
		" B ",
		'A', new ItemStack(earthgem), 'B', new ItemStack(Items.stick)});

		
		GameRegistry.addRecipe(new ItemStack(iceshovel), new Object[]{
		"  A",
		"  B",
		"  B",
		'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});

		GameRegistry.addRecipe(new ItemStack(lightningshovel), new Object[]{
		"  A",
		"  B",
		"  B",
		'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

		GameRegistry.addRecipe(new ItemStack(earthshovel), new Object[]{
		"  A",
		"  B",
		"  B",
		'A', new ItemStack(earthgem), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(icesword), new Object[]{
				"A  ",
				"A  ",
				"B  ",
			    'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(icesword), new Object[]{
			" A ",
			" A ",
			" B ",
		    'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(icesword), new Object[]{
			"  A",
			"  A",
			"  B",
		    'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(earthsword), new Object[]{
			"A  ",
			"A  ",
			"B  ",
		    'A', new ItemStack(earthgem), 'B', new ItemStack(Items.stick)});
	
	GameRegistry.addRecipe(new ItemStack(earthsword), new Object[]{
		" A ",
		" A ",
		" B ",
	    'A', new ItemStack(earthgem), 'B', new ItemStack(Items.stick)});
	
	GameRegistry.addRecipe(new ItemStack(earthsword), new Object[]{
		"  A",
		"  A",
		"  B",
	    'A', new ItemStack(earthgem), 'B', new ItemStack(Items.stick)});
	
	GameRegistry.addRecipe(new ItemStack(lightningsword), new Object[]{
		"A  ",
		"A  ",
		"B  ",
	    'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

GameRegistry.addRecipe(new ItemStack(lightningsword), new Object[]{
	" A ",
	" A ",
	" B ",
    'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

GameRegistry.addRecipe(new ItemStack(lightningsword), new Object[]{
	"  A",
	"  A",
	"  B",
    'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

GameRegistry.addRecipe(new ItemStack(iceaxe), new Object[]{
		" AA",
		" BA",
		" B ",
	'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});

GameRegistry.addRecipe(new ItemStack(iceaxe), new Object[]{
	"AA ",
	"BA ",
	"B  ",
'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});

GameRegistry.addRecipe(new ItemStack(earthaxe), new Object[]{
	" AA",
	" BA",
	" B ",
    'A', new ItemStack(earthgem), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(earthaxe), new Object[]{
		"AA ",
		"BA ",
		"B  ",
		'A', new ItemStack(earthgem), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(lightningaxe), new Object[]{
	" AA",
	" BA",
	" B ",
	'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(lightningaxe), new Object[]{
    "AA ",
    "BA ",
    "B  ",
    'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(icehoe), new Object[]{
	" AA",
	" B ",
	" B ",
	'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(icehoe), new Object[]{
		"AA ",
		"B  ",
		"B  ",
		'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(earthhoe), new Object[]{
		" AA",
		" B ",
		" B ",
		'A', new ItemStack(earthgem), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(earthhoe), new Object[]{
		"AA ",
		"B  ",
		"B  ",
		'A', new ItemStack(earthgem), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(lightninghoe), new Object[]{
		" AA",
		" B ",
		" B ",
	'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(lightninghoe), new Object[]{
		"AA ",
		"B  ",
		"B  ",
		'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});
	
	GameRegistry.addRecipe(new ItemStack(camosword), new Object[]{
		"A  ",
		"A  ",
		"B  ",
	    'A', new ItemStack(camoGem), 'B', new ItemStack(Items.stick)});
	
	GameRegistry.addRecipe(new ItemStack(camoaxe), new Object[]{
	    "AA ",
	    "BA ",
	    "B  ",
	    'A', new ItemStack(camoGem), 'B', new ItemStack(Items.stick)});

		GameRegistry.addRecipe(new ItemStack(camoaxe), new Object[]{
		" AA",
		" BA",
		" B ",
		'A', new ItemStack(camoGem), 'B', new ItemStack(Items.stick)});


GameRegistry.addRecipe(new ItemStack(camosword), new Object[]{
	" A ",
	" A ",
	" B ",
    'A', new ItemStack(camoGem), 'B', new ItemStack(Items.stick)});

GameRegistry.addRecipe(new ItemStack(camosword), new Object[]{
	"  A",
	"  A",
	"  B",
    'A', new ItemStack(camoGem), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 1), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 2), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 3), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 4), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 5), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 6), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 7), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 8), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 9), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 10), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 11), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 12), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 13), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 14), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', new ItemStack(Blocks.wool, 1, 15), 'B', new ItemStack(Items.water_bucket)});
		GameRegistry.addRecipe(new ItemStack(fireblock), new Object[]{
			"AAA",
			"AAA",
			"AAA",
			'A', new ItemStack(firecrystal)});
		GameRegistry.addRecipe(new ItemStack(lightningblock), new Object[]{
			"AAA",
			"AAA",
			"AAA",
			'A', new ItemStack(lightningcrystal)});
		GameRegistry.addRecipe(new ItemStack(iceblock), new Object[]{
			"AAA",
			"AAA",
			"AAA",
			'A', new ItemStack(icecrystal)});
		GameRegistry.addRecipe(new ItemStack(earthblock), new Object[]{
			"AAA",
			"AAA",
			"AAA",
			'A', new ItemStack(earthgem)});
		GameRegistry.addRecipe(new ItemStack(camoblock), new Object[]{
			"AAA",
			"AAA",
			"AAA",
			'A', new ItemStack(camoGem)});
		GameRegistry.addRecipe(new ItemStack(CamoHelmet), new Object[]{
			"   ",
			"AAA",
			"A A",
			'A', new ItemStack(camoGem)});
		GameRegistry.addRecipe(new ItemStack(CamoHelmet), new Object[]{
			"AAA",
			"A A",
			"   ",
			'A', new ItemStack(camoGem)});
		GameRegistry.addRecipe(new ItemStack(CamoPlate), new Object[]{
			"A A",
			"AAA",
			"AAA",
			'A', new ItemStack(camoGem)});
		GameRegistry.addRecipe(new ItemStack(CamoLegs), new Object[]{
			"AAA",
			"A A",
			"A A",
			'A', new ItemStack(camoGem)});
		GameRegistry.addRecipe(new ItemStack(CamoBoots), new Object[]{
			"   ",
			"A A",
			"A A",
			'A', new ItemStack(camoGem)});
		GameRegistry.addRecipe(new ItemStack(CamoBoots), new Object[]{
			"A A",
			"A A",
			"   ",
			'A', new ItemStack(camoGem)});
		
		GameRegistry.addRecipe(new ItemStack(EarthHelmet), new Object[]{
			"   ",
			"AAA",
			"A A",
			'A', new ItemStack(earthgem)});
		GameRegistry.addRecipe(new ItemStack(EarthHelmet), new Object[]{
			"AAA",
			"A A",
			"   ",
			'A', new ItemStack(earthgem)});
		GameRegistry.addRecipe(new ItemStack(EarthPlate), new Object[]{
			"A A",
			"AAA",
			"AAA",
			'A', new ItemStack(earthgem)});
		GameRegistry.addRecipe(new ItemStack(EarthLegs), new Object[]{
			"AAA",
			"A A",
			"A A",
			'A', new ItemStack(earthgem)});
		GameRegistry.addRecipe(new ItemStack(EarthBoots), new Object[]{
			"   ",
			"A A",
			"A A",
			'A', new ItemStack(earthgem)});
		GameRegistry.addRecipe(new ItemStack(EarthBoots), new Object[]{
			"A A",
			"A A",
			"   ",
			'A', new ItemStack(earthgem)});
		
		GameRegistry.addRecipe(new ItemStack(LightningHelmet), new Object[]{
			"   ",
			"AAA",
			"A A",
			'A', new ItemStack(lightningcrystal)});
		GameRegistry.addRecipe(new ItemStack(LightningHelmet), new Object[]{
			"AAA",
			"A A",
			"   ",
			'A', new ItemStack(lightningcrystal)});
		GameRegistry.addRecipe(new ItemStack(LightningPlate), new Object[]{
			"A A",
			"AAA",
			"AAA",
			'A', new ItemStack(lightningcrystal)});
		GameRegistry.addRecipe(new ItemStack(LightningLegs), new Object[]{
			"AAA",
			"A A",
			"A A",
			'A', new ItemStack(lightningcrystal)});
		GameRegistry.addRecipe(new ItemStack(LightningBoots), new Object[]{
			"   ",
			"A A",
			"A A",
			'A', new ItemStack(lightningcrystal)});
		GameRegistry.addRecipe(new ItemStack(LightningBoots), new Object[]{
			"A A",
			"A A",
			"   ",
			'A', new ItemStack(lightningcrystal)});
		
		GameRegistry.addRecipe(new ItemStack(IceHelmet), new Object[]{
			"   ",
			"AAA",
			"A A",
			'A', new ItemStack(icecrystal)});
		GameRegistry.addRecipe(new ItemStack(IceHelmet), new Object[]{
			"AAA",
			"A A",
			"   ",
			'A', new ItemStack(icecrystal)});
		GameRegistry.addRecipe(new ItemStack(IcePlate), new Object[]{
			"A A",
			"AAA",
			"AAA",
			'A', new ItemStack(icecrystal)});
		GameRegistry.addRecipe(new ItemStack(IceLegs), new Object[]{
			"AAA",
			"A A",
			"A A",
			'A', new ItemStack(icecrystal)});
		GameRegistry.addRecipe(new ItemStack(IceBoots), new Object[]{
			"   ",
			"A A",
			"A A",
			'A', new ItemStack(icecrystal)});
		GameRegistry.addRecipe(new ItemStack(IceBoots), new Object[]{
			"A A",
			"A A",
			"   ",
			'A', new ItemStack(icecrystal)});
			
		//smelting
		GameRegistry.addSmelting(new ItemStack(fireOre), new ItemStack(firecrystal), 5f);
		GameRegistry.addSmelting(new ItemStack(earthore), new ItemStack(earthgem), 5f);
		GameRegistry.addSmelting(new ItemStack(lightningore), new ItemStack(lightningcrystal), 5f);
		GameRegistry.addSmelting(new ItemStack(camoOre), new ItemStack(camoGem), 5f);
		//enchantment
		
		ItemStack newEnch = new ItemStack(firepick);
		newEnch.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch, new Object[]{
			"AAA",
			" B ",
			" B ",
			'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch2 = new ItemStack(fireshovel);
		newEnch2.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch2, new Object[]{
				"A  ",
				"B  ",
				"B  ",
				'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch3 = new ItemStack(fireshovel);
		newEnch3.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch3, new Object[]{
				" A ",
				" B ",
				" B ",
				'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch4 = new ItemStack(fireshovel);
		newEnch4.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch4, new Object[]{
				"  A",
				"  B",
				"  B",
				'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch5 = new ItemStack(firesword);
		newEnch5.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch5, new Object[]{
				"A  ",
				"A  ",
				"B  ",
			    'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch6 = new ItemStack(firesword);
		newEnch6.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch6, new Object[]{
				" A ",
				" A ",
				" B ",
			    'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch7 = new ItemStack(firesword);
		newEnch7.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch7, new Object[]{
				"  A",
				"  A",
				"  B",
			'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch8 = new ItemStack(fireaxe);
		newEnch8.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch8, new Object[]{
				" AA",
				" BA",
				" B ",
			'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch9 = new ItemStack(fireaxe);
		newEnch9.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch9, new Object[]{
				"AA ",
				"BA ",
				"B  ",
			'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch10 = new ItemStack(firehoe);
		newEnch10.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch10, new Object[]{
				"AA ",
				"B  ",
				"B  ",
			'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch11 = new ItemStack(firehoe);
		newEnch11.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch11, new Object[]{
				" AA",
				" B ",
				" B ",
			'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
	
		
	ItemStack newEnch12 = new ItemStack(FlameHelmet);
	newEnch12.addEnchantment(Enchantment.fireProtection, 10);
	GameRegistry.addRecipe(newEnch12, new Object[]{
			"AAA",
			"A A",
			"   ",
		'A', new ItemStack(firecrystal)});
	
	ItemStack newEnch13 = new ItemStack(FlameHelmet);
	newEnch13.addEnchantment(Enchantment.fireProtection, 10);
	GameRegistry.addRecipe(newEnch13, new Object[]{
			"   ",
			"AAA",
			"A A",
		'A', new ItemStack(firecrystal)});
	
	ItemStack newEnch14 = new ItemStack(FlameBoots);
	newEnch14.addEnchantment(Enchantment.fireProtection, 10);
	GameRegistry.addRecipe(newEnch14, new Object[]{
			"   ",
			"A A",
			"A A",
		'A', new ItemStack(firecrystal)});
	
	ItemStack newEnch15 = new ItemStack(FlameBoots);
	newEnch15.addEnchantment(Enchantment.fireProtection, 10);
	GameRegistry.addRecipe(newEnch15, new Object[]{
			"A A",
			"A A",
			"   ",
		'A', new ItemStack(firecrystal)});
	
	ItemStack newEnch16 = new ItemStack(FlameLegs);
	newEnch16.addEnchantment(Enchantment.fireProtection, 10);
	GameRegistry.addRecipe(newEnch16, new Object[]{
			"AAA",
			"A A",
			"A A",
		'A', new ItemStack(firecrystal)});
	
	ItemStack newEnch17 = new ItemStack(FlamePlate);
	newEnch17.addEnchantment(Enchantment.fireProtection, 10);
	GameRegistry.addRecipe(newEnch17, new Object[]{
			"A A",
			"AAA",
			"AAA",
		'A', new ItemStack(firecrystal)});
	
	ItemStack newEnch18 = new ItemStack(Items.stick);
	newEnch18.addEnchantment(Enchantment.knockback, 100);
	GameRegistry.addShapelessRecipe(newEnch18, Items.stick);
	}
	


	
	
    public static void MyItems(){
    	//what comes out of block
    	firecrystal = new FireCrystal();
    	GameRegistry.registerItem(firecrystal, "fire_crystal");
    	
    	icecrystal = new IceCrystal();
    	GameRegistry.registerItem(icecrystal, "ice_crystal");
    	
    	earthgem = new EarthGem();
    	GameRegistry.registerItem(earthgem, "earth_gem");
    	
    	lightningcrystal = new LightningCrystal();
    	GameRegistry.registerItem(lightningcrystal, "lightning_crystal");
    	
    	camoGem = new CamoGem();
    	GameRegistry.registerItem(camoGem, "camo_gem");
    	
    	//pick are here
    	fireMaterial = EnumHelper.addToolMaterial("fire_material", 3, 2000, 20f, 5f, 30);
    	firepick = new FirePick(fireMaterial);
    	GameRegistry.registerItem(firepick, "fire_pick");
    	
    	fireMaterial = EnumHelper.addToolMaterial("fire_material", 3, 2000, 0f, 20f, 30);
    	firesword = new FireSword(fireMaterial);
    	GameRegistry.registerItem(firesword, "fire_sword");
    	
    	fireMaterial = EnumHelper.addToolMaterial("fire_material", 3, 2000, 20f, 20f, 30);
    	fireaxe = new FireAxe(fireMaterial);
    	GameRegistry.registerItem(fireaxe, "fire_axe");
    	
    	fireMaterial = EnumHelper.addToolMaterial("fire_material", 3, 2000, 20f, 5f, 30);
    	fireshovel = new FireShovel(fireMaterial);
    	GameRegistry.registerItem(fireshovel, "fire_shovel");
    	
    	fireMaterial = EnumHelper.addToolMaterial("fire_material", 3, 2000, 20f, 5f, 30);
    	firehoe = new FireHoe(fireMaterial);
    	GameRegistry.registerItem(firehoe, "fire_hoe");
    	
    	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 30);
    	icepick = new IcePick(iceMaterial);
    	GameRegistry.registerItem(icepick, "ice_pick");
    	
    	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 30);
    	icesword = new IceSword(iceMaterial);
    	GameRegistry.registerItem(icesword, "ice_sword");
    	
    	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 30);
    	iceaxe = new IceAxe(iceMaterial);
    	GameRegistry.registerItem(iceaxe, "ice_axe");
    	
    	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 30);
    	iceshovel = new IceShovel(iceMaterial);
    	GameRegistry.registerItem(iceshovel, "ice_shovel");
    	
    	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 30);
    	icehoe = new IceHoe(iceMaterial);
    	GameRegistry.registerItem(icehoe, "ice_hoe");
    	
    	earthMaterial = EnumHelper.addToolMaterial("earth_material", 3, 3000, 15f, 5f, 30);
    	earthpick = new EarthPick(earthMaterial);
    	GameRegistry.registerItem(earthpick, "earth_pick");
    	
    	earthMaterial = EnumHelper.addToolMaterial("earth_material", 3, 3000, 0f, 15f, 30);
    	earthsword = new EarthSword(earthMaterial);
    	GameRegistry.registerItem(earthsword, "earth_sword");
    	
    	earthMaterial = EnumHelper.addToolMaterial("earth_material", 3, 3000, 15f, 15f, 30);
    	earthaxe = new EarthAxe(earthMaterial);
    	GameRegistry.registerItem(earthaxe, "earth_axe");
    	
    	earthMaterial = EnumHelper.addToolMaterial("earth_material", 3, 3000, 15f, 5f, 30);
    	earthshovel = new EarthShovel(earthMaterial);
    	GameRegistry.registerItem(earthshovel, "earth_shovel");
    	
    	earthMaterial = EnumHelper.addToolMaterial("earth_material", 3, 3000, 15f, 5f, 30);
    	earthhoe = new EarthHoe(earthMaterial);
    	GameRegistry.registerItem(earthhoe, "earth_hoe");
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 30f, 5f, 30);
    	lightningpick = new LightningPick(lightningMaterial);
    	GameRegistry.registerItem(lightningpick, "lightning_pick");
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 0f, 30f, 30);
    	lightningsword = new LightningSword(lightningMaterial);
    	GameRegistry.registerItem(lightningsword, "lightning_sword");
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 30f, 30f, 30);
    	lightningaxe = new LightningAxe(lightningMaterial);
    	GameRegistry.registerItem(lightningaxe, "lightning_axe");
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 30f, 5f, 30);
    	lightningshovel = new LightningShovel(lightningMaterial);
    	GameRegistry.registerItem(lightningshovel, "lightning_shovel");
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 30f, 5f, 30);
    	lightninghoe = new LightningHoe(lightningMaterial);
    	GameRegistry.registerItem(lightninghoe, "lightning_hoe");
    	
    	camoMaterial = EnumHelper.addToolMaterial("camo_material", 3, 3000, 0f, 15f, 30);
    	camosword = new CamoSword(camoMaterial);
    	GameRegistry.registerItem(camosword, "camo_sword");
    	
    	camoMaterial = EnumHelper.addToolMaterial("camo_material", 3, 3000, 15f, 15f, 30);
    	camoaxe = new CamoAxe(camoMaterial);
    	GameRegistry.registerItem(camoaxe, "camo_axe");
    	
    	
    	 myArmorMaterial = EnumHelper.addArmorMaterial("myArmorMaterial", 2000, new int[]{6, 10, 9, 5}, 30);
         //(name, durability, damageReductionAmounts, enchantability)
    	 FlameHelmet = new FlameArmor(myArmorMaterial, helmid, 0).setUnlocalizedName("flame_helmet");
    	 FlamePlate = new FlameArmor(myArmorMaterial, chestid, 1).setUnlocalizedName("flame_chestplate");
    	 FlameLegs = new FlameArmor(myArmorMaterial, legid, 2).setUnlocalizedName("flame_leggings");
    	 FlameBoots = new FlameArmor(myArmorMaterial, bootid, 3).setUnlocalizedName("flame_boots");
    	 GameRegistry.registerItem(FlameHelmet, "flame_helmet");
    	 GameRegistry.registerItem(FlamePlate, "flame_chestplate");
    	 GameRegistry.registerItem(FlameLegs, "flame_leggings");
    	        GameRegistry.registerItem(FlameBoots, "flame_boots");
    	        
    	 myArmorMaterial = EnumHelper.addArmorMaterial("myArmorMaterial", 2000, new int[]{5, 8, 7, 4}, 30);
    	 //(name, durability, damageReductionAmounts, enchantability)
    	 IceHelmet = new IceArmor(myArmorMaterial, helmid2, 0).setUnlocalizedName("Ice_helmet");
    	 IcePlate = new IceArmor(myArmorMaterial, chestid2, 1).setUnlocalizedName("Ice_chestplate");
    	 IceLegs = new IceArmor(myArmorMaterial, legid2, 2).setUnlocalizedName("Ice_leggings");
    	 IceBoots = new IceArmor(myArmorMaterial, bootid2, 3).setUnlocalizedName("Ice_boots");
    	 GameRegistry.registerItem(IceHelmet, "Ice_helmet");
    	 GameRegistry.registerItem(IcePlate, "Ice_chestplate");
    	 GameRegistry.registerItem(IceLegs, "Ice_leggings");
    	 GameRegistry.registerItem(IceBoots, "Ice_boots");
    	 
         
     	 
         
     	 myArmorMaterial = EnumHelper.addArmorMaterial("myArmorMaterial", 3000, new int[]{7, 13, 12, 6}, 30);
     	 //(name, durability, damageReductionAmounts, enchantability)
     	 EarthHelmet = new EarthArmor(myArmorMaterial, helmid4, 0).setUnlocalizedName("Earth_helmet");
     	EarthPlate = new EarthArmor(myArmorMaterial, chestid4, 1).setUnlocalizedName("Earth_chestplate");
     	EarthLegs = new EarthArmor(myArmorMaterial, legid4, 2).setUnlocalizedName("Earth_leggings");
     	EarthBoots = new EarthArmor(myArmorMaterial, bootid4, 3).setUnlocalizedName("Earth_boots");
     	 GameRegistry.registerItem(EarthHelmet, "Earth_helmet");
     	 GameRegistry.registerItem(EarthPlate, "Earth_chestplate");
     	 GameRegistry.registerItem(EarthLegs, "Earth_leggings");
     	 GameRegistry.registerItem(EarthBoots, "Earth_boots");
     	 
         
     	 myArmorMaterial = EnumHelper.addArmorMaterial("myArmorMaterial", 1500, new int[]{8, 15, 14, 1}, 30);
     	 //(name, durability, damageReductionAmounts, enchantability)
     	 LightningHelmet = new LightningArmor(myArmorMaterial, helmid5, 0).setUnlocalizedName("Lightning_helmet");
     	LightningPlate = new LightningArmor(myArmorMaterial, chestid5, 1).setUnlocalizedName("Lightning_chestplate");
     	LightningLegs = new LightningArmor(myArmorMaterial, legid5, 2).setUnlocalizedName("Lightning_leggings");
     	LightningBoots = new LightningArmor(myArmorMaterial, bootid5, 3).setUnlocalizedName("Lightning_boots");
     	 GameRegistry.registerItem(LightningHelmet, "Lightning_helmet");
     	 GameRegistry.registerItem(LightningPlate, "Lightning_chestplate");
     	 GameRegistry.registerItem(LightningLegs, "Lightning_leggings");
     	 GameRegistry.registerItem(LightningBoots, "Lightning_boots");
    }
     	 
     	
}


