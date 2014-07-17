package com.allforfunmc.refineddiamond;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RefinedOre extends Block {
    public RefinedOre(Material material) {
            super(material);
            setHardness(25F);
            setCreativeTab(Code.AllForFunTab);
            setBlockTextureName("refineddiamondmod:refinedore");
            setHarvestLevel("Pickaxe", 4);
            setResistance(50);
            setBlockName("RefinedOre");
    }
    
}