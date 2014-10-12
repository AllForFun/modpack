package com.allforfunmc.scaffolding;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.allforfunmc.allforfuncore.Core;

public class BlockOfScaffoldingWithLight extends Block {
    public BlockOfScaffoldingWithLight(Material material) {
	super(material);
	setHardness(0);
	setCreativeTab(Core.AllForFunBlocks);
	setBlockTextureName("ScaffoldingMod:lightedScaffolding");
	setHarvestLevel("hand", 0);
	setLightLevel(1F);
	setResistance(0);
	setBlockName("LightedScaffolding");
    }

}