package com.allforfunmc.scaffolding;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.allforfunmc.allforfuncore.Core;

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