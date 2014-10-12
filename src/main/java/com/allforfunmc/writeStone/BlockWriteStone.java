package com.allforfunmc.writeStone;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockWriteStone extends Block implements ITileEntityProvider {

    protected BlockWriteStone() {
	super(Material.redstoneLight);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
	return new TileEntityWriteStone();
    }
}
