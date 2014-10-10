package com.allforfunmc.refineddiamond;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.allforfunmc.allforfuncore.Core;

public class Refined_Diamond_Block extends Block {
    public Refined_Diamond_Block(Material material) {
	super(material);
	setHardness(25F);
	setCreativeTab(Core.AllForFunBlocks);
	setBlockTextureName("refineddiamondmod:refineddiamondblock");
	setHarvestLevel("Pickaxe", 5);
	setResistance(250);
	setBlockName("RefinedDiamondBlock");
    }

}