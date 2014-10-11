package com.allforfunmc.moreoresandmore;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;

public class CobbleGenEntity extends TileEntity{
		public CobbleGenEntity(Block block){
			genBlock = block;
		}
		public static Block genBlock = Blocks.air;
	    public void updateEntity() {
	    	worldObj.setBlock(xCoord, yCoord + 1, zCoord, genBlock);
	    }
}
