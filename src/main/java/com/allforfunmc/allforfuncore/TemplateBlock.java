package com.allforfunmc.allforfuncore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TemplateBlock extends Block {
    public TemplateBlock(Material mat, String Name) {
	super(mat);
	this.setCreativeTab(Core.AllForFunBlocks);
	this.setBlockName(Name);
    }
}
