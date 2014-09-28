package com.allforfunmc.refineddiamond;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Code {
	public static Item refinedDiamond;
	public static Item hotDiamond;
	public static Item refinedpick;
	public static Item refinedaxe;
	public static Item MeltingPick;
	public static Block Refined_Diamond_Block;
	public static Block refinedOre;
	public static IWorldGenerator Generator;
	public static void Items() {
		
		ToolMaterial RefinedDiamondTool = EnumHelper.addToolMaterial("refinedDiamond", 5, 3500, 50F, 15, 1);
		ToolMaterial MeltingTool = EnumHelper.addToolMaterial("meltingTool", 4, 350, 4, 25f, 1);
		
		refinedDiamond = new RefinedDiamond();
		GameRegistry.registerItem(refinedDiamond, "refinedDiamond");
		hotDiamond = new HotDiamond();
		GameRegistry.registerItem(hotDiamond, "hotDiamond");
		refinedpick = new RefinedPick(RefinedDiamondTool);
		GameRegistry.registerItem(refinedpick, "refinedpick");
		refinedOre = new RefinedOre(Material.rock);
		GameRegistry.registerBlock(refinedOre, "refinedOre");
		refinedaxe = new RefinedAxe(RefinedDiamondTool);
		GameRegistry.registerItem(refinedaxe, "refinedaxe");
		Generator = new Generator();
		GameRegistry.registerWorldGenerator(Generator, 15);
		MeltingPick = new MeltingPickaxe(MeltingTool);
		GameRegistry.registerItem(MeltingPick, "MeltingPick");
		
		/*
		 * Recipes
		 */
		//Smelting
		GameRegistry.addSmelting(new ItemStack(Items.diamond), new ItemStack(hotDiamond), 0F);
		GameRegistry.addSmelting(new ItemStack(refinedDiamond), new ItemStack(hotDiamond, 2), 0F);
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond), new ItemStack(hotDiamond));
		//Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(refinedDiamond,2), new Object[] {
			" H ",
			"H H",
			" H ",
			'H', hotDiamond
		});
		GameRegistry.addRecipe(new ItemStack(refinedpick), new Object[]{
			"RRR",
			" S ",
			" S ",
			'R', refinedDiamond, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(refinedaxe), new Object[]{
			"RR ",
			"RS ",
			" S ",
			'S', Items.stick, 'R', refinedDiamond
		});
		GameRegistry.addRecipe(new ItemStack(MeltingPick), new Object[]{
			"DDD",
			" S ",
			" S ",
			'D', hotDiamond, 's', Items.stick
		});
		/*
		 * Block
		 */
		Refined_Diamond_Block = new Refined_Diamond_Block(Material.rock);
		GameRegistry.registerBlock(Refined_Diamond_Block, "Refined_Diamond_Block");
		
		GameRegistry.addRecipe(new ItemStack(Refined_Diamond_Block), new Object[]{
			"RRR",
			"RRR",
			"RRR",
			'R', refinedDiamond
		});
		}
}
