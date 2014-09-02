package com.allforfunmc.easyoreapi;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class EasyOre extends Block{
	Item Drop = Item.getItemFromBlock(this);
	int quantityDrop = 1;
	public EasyOre(String unlocalisedName, String texture, int toolLevel, Item drop, int quantityDrop, float resistance) {
		super(Material.rock);
		this.setBlockName(unlocalisedName);
		this.setBlockTextureName(texture);
		this.setHarvestLevel("Pickaxe", toolLevel);
		this.setHardness(toolLevel * 5);
		this.Drop = drop;
		this.quantityDrop = quantityDrop;
		this.blockResistance = resistance;
	}
	 /* Creates a new ore on post init.
	 * Drop, quantityDrop, and resistance are optional */
	public Block newEasyOre(String unlocalisedName, String texture, int toolLevel, Item drop, int quantityDrop, float resistance){
		Block NewOre = new EasyOre(unlocalisedName, texture, toolLevel, drop, quantityDrop, resistance);
		GameRegistry.registerBlock(NewOre, unlocalisedName);
		return NewOre;
	}
	public static HashMap maxX = new HashMap();
	public static HashMap maxZ = new HashMap();
	public static HashMap maxVeinSize = new HashMap();
	public static HashMap chancesToSpawn = new HashMap();
	public static HashMap minY = new HashMap();
	public static HashMap maxY = new HashMap();
	public static ArrayList<Block> blocksToGenerate = new ArrayList<Block>();
	public void EasyGenerator(Block block, int maxX, int maxZ,
			int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
		this.maxX.put(block, maxX);
		this.maxZ.put(block, maxZ);
		this.maxVeinSize.put(block, maxVeinSize);
		this.chancesToSpawn.put(block, chancesToSpawn);
		this.minY.put(block, minY);
		this.maxY.put(block, maxY);
		blocksToGenerate.add(block);
	}
	public Block newEasyOre(String unlocalisedName, String texture, int toolLevel, Item drop, int quantityDrop, float resistance, int maxX, int maxZ,
			int maxVeinSize, int chancesToSpawn, int minY, int maxY){
		Block NewOre = new EasyOre(unlocalisedName, texture, toolLevel, drop, quantityDrop, resistance);
		GameRegistry.registerBlock(NewOre, unlocalisedName);
		EasyGenerator(NewOre,maxX,maxZ,maxVeinSize,chancesToSpawn,minY,maxY);
		return NewOre;
	}
	public Block newEasyOre(String unlocalisedName, String texture, int toolLevel, Item drop, int quantityDrop){
		Block NewOre = newEasyOre(unlocalisedName, texture, toolLevel, drop, quantityDrop, (toolLevel + 1) * 25);
		return NewOre;
	}
	public Block newEasyOre(String unlocalisedName, String texture, int toolLevel, Item drop, float resistance){
		Block NewOre = newEasyOre(unlocalisedName, texture, toolLevel, drop, 1, resistance);
		return NewOre;
	}
	public Block newEasyOre(String unlocalisedName, String texture, int toolLevel, float resistance){
		Block NewOre = newEasyOre(unlocalisedName, texture, toolLevel, Item.getItemFromBlock(this), 1, resistance);
		return NewOre;
	}
	public Block newEasyOre(String unlocalisedName, String texture){
		Block NewOre = newEasyOre(unlocalisedName, texture, 0, 2F);
		return NewOre;
	}
	
	
	@Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Drop;
    }
    public int quantityDropped(Random p_149745_1_)
    {
        return quantityDrop;
    }
}
