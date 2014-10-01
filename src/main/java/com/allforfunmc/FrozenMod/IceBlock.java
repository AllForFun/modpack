package com.allforfunmc.FrozenMod;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class IceBlock extends  Block{
	
	public IceBlock (int iceblockID, Material mat){
		super(mat);
		setBlockName("ice_block");
		setCreativeTab(Core.AllForFunBlocks);
		this.setHardness(6f);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("sleshymod:ice_block");
	}

}
