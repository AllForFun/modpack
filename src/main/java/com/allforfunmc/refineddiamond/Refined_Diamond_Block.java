package com.allforfunmc.refineddiamond;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

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