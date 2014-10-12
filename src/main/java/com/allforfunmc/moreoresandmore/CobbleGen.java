package com.allforfunmc.moreoresandmore;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class CobbleGen extends Block implements ITileEntityProvider{
	public static Block BlockToGen = Blocks.air;
	public CobbleGen(Block Block){
		super(Material.piston);
		this.setBlockName(Block.getUnlocalizedName() + ".gen");
	}
	@Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new CobbleGenEntity(BlockToGen);
    }
}
