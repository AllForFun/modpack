package com.allforfunmc.scaffolding;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockOfScaffolding extends Block {
    public BlockOfScaffolding(Material material) {
            super(material);
            setHardness(0);
            setCreativeTab(Core.AllForFunBlocks);
            setBlockTextureName("stone_slab_top");
            setHarvestLevel("hand", 0);
            setResistance(0);
            setBlockName("Scaffolding");
    }
    
}