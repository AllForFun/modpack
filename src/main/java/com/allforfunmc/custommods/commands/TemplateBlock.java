package com.allforfunmc.custommods.commands;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;

public class TemplateBlock extends Block {
	public TemplateBlock(Material material,String texture){
		super (material);
		this.setBlockTextureName(texture);
		this.setCreativeTab(Core.AllForFunBlocks);
	}
}
