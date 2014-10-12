package com.allforfunmc.PaintBrush;

import java.util.ArrayList;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class Paintbrush extends Item{
	public Paintbrush(){
		this.setCreativeTab(Core.AllForFunTools);
		this.setUnlocalizedName("paintbrush");
	}
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
		if (!world.isRemote){
			int x = (int) player.getLookVec().xCoord;
			int y = (int) player.getLookVec().yCoord;
			int z = (int) player.getLookVec().zCoord;
			
			Block block = world.getBlock(x, y, z);
			int meta = world.getBlockMetadata(x, y, z);
			
			if(block.equals(Blocks.wool)){
				meta++;
			}
			
			world.setBlock(x, y, z, block);
			world.setBlock(x, y, z, block, meta, 2);
			
	        return stack;
		} else {
			return stack;
		}
    }
}