package com.allforfunmc.PaintBrush;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class Paintbrush extends Item{
	public Paintbrush(){
		
	}
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
		int x = (int) player.getLookVec().xCoord;
		int y = (int) player.getLookVec().yCoord;
		int z = (int) player.getLookVec().zCoord;
		ForgeDirection down = ForgeDirection.DOWN;
		ForgeDirection east = ForgeDirection.EAST;
		ForgeDirection north = ForgeDirection.NORTH;
		ForgeDirection south = ForgeDirection.SOUTH;
		ForgeDirection up = ForgeDirection.UP;
		ForgeDirection west = ForgeDirection.WEST;
		Block.recolourBlock colorBlock = new Block.recolourBlock();

		if(
			
		}
        return stack;
    }
}