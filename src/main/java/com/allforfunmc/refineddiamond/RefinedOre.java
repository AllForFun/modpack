package com.allforfunmc.refineddiamond;

import net.minecraft.block.Block;

import java.util.Random;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RefinedOre extends Block {
	private int r;
	private int f = 0;
    public RefinedOre(Material material) {
            super(material);
            setHardness(15F);
            setCreativeTab(Core.AllForFunBlocks);
            setBlockTextureName("refineddiamondmod:refinedore");
            setHarvestLevel("Pickaxe", 3);
            setResistance(50);
            setBlockName("RefinedOre");
    }
    @Override
    public Item getItemDropped(int metadata, Random random, int fourtune){
    	f = fourtune;
    	
    	if(r == 0){
    		return null;
    	}else if(r == 1 ){
    		return Code.refinedDiamond;
    	}else if(r == 2){
    		return Items.diamond;
    	}else {
    		return Code.refinedDiamond;
    	}	
    }
    @Override
	public int quantityDropped(Random random){
    	r = random.nextInt(f + 1);
    	if (r >= 3){
    		return r - 1;
    	} else {
    		return 1;
    	}
	}
}