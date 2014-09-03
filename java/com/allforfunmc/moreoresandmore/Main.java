package com.allforfunmc.moreoresandmore;

import com.allforfunmc.easyoreapi.EasyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid =  Main.modid, version = Main.version)
public class Main {

	public static final String modid = "moreoresandmore";
	public static final String name = "AllForFun's More Ores And More";
	public static final String version = "1.0.0";
	
	public static int armorCobbleHelmID;
	public static int armorCobbleChestID;
	public static int armorCobbleLegsID;
	public static int armorCobbleBootsID;
	
	public static Item armorCobbleHelm;
	public static Item armorCobbleChest;
	public static Item armorCobbleLegs;
	public static Item armorCobbleBoots;
	
	public static ArmorMaterial CobbleArmorMaterial = EnumHelper.addArmorMaterial("CobbleArmor", 15, new int[] {2, 6, 5, 2}, 9);
	
	public static Block blockCompressedCobble;

	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
			

		
		//blocks
		blockCompressedCobble = new CompressedCobble(Material.rock).setBlockName("CompressedCobble").setHardness(5.0F).setResistance(2000.0F);
		GameRegistry.registerBlock(blockCompressedCobble, "CompressedCobble");
		
		
		
		//armor
		armorCobbleHelm = new CobbleArmor(CobbleArmorMaterial, armorCobbleHelmID, 0).setUnlocalizedName("CobbleHelm");
		GameRegistry.registerItem(armorCobbleHelm, "CobbleHelm");
		
		armorCobbleChest = new CobbleArmor(CobbleArmorMaterial, armorCobbleChestID, 1).setUnlocalizedName("CobbleChest");
		GameRegistry.registerItem(armorCobbleChest, "CobbleChest");
		
		armorCobbleLegs = new CobbleArmor(CobbleArmorMaterial, armorCobbleLegsID, 2).setUnlocalizedName("CobbleLegs");
		GameRegistry.registerItem(armorCobbleLegs, "CobbleLegs");
		
		armorCobbleBoots = new CobbleArmor(CobbleArmorMaterial, armorCobbleBootsID, 3).setUnlocalizedName("CobbleBoots");
		GameRegistry.registerItem(armorCobbleBoots, "CobbleBoots");
		
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent Event){
		
		//crafting
		GameRegistry.addShapedRecipe(new ItemStack(blockCompressedCobble, 1), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.cobblestone});
		
		GameRegistry.addShapedRecipe(new ItemStack(armorCobbleHelm, 1), new Object[]{"XXX", "X X", 'X', blockCompressedCobble});
		GameRegistry.addShapedRecipe(new ItemStack(armorCobbleChest, 1), new Object[]{"X X", "XXX", "XXX", 'X', blockCompressedCobble});
		GameRegistry.addShapedRecipe(new ItemStack(armorCobbleLegs, 1), new Object[]{"XXX", "X X", "X X", 'X', blockCompressedCobble});
		GameRegistry.addShapedRecipe(new ItemStack(armorCobbleBoots, 1), new Object[]{"X X", "X X", 'X', blockCompressedCobble});
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		/*Args: int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY*/
		EasyOre.EasyGenerator(blockCompressedCobble, 10, 10, 25, 25, 1, 35);
		//items
	}
}
