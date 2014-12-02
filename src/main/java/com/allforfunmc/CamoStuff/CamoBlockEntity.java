package com.allforfunmc.CamoStuff;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;

public class CamoBlockEntity extends TileEntity{

	public Block block;
	public int meta;

	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		block = Block.getBlockById(nbt.getInteger("Block"));
		meta = nbt.getInteger("Meta");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		nbt.setInteger("Block", Block.getIdFromBlock(block));
		nbt.setInteger("Meta", meta);
	}



}
