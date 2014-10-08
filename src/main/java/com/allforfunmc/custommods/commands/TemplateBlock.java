package com.allforfunmc.custommods.commands;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;

public class TemplateBlock extends Block {
	public TemplateBlock(String name, String textureName, Material material){
		super (material);
		this.setCreativeTab(Core.AllForFunBlocks);
	}
}
