package com.allforfunmc.creeperore;

import net.minecraft.block.Block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Mine extends Block {
	public Block block;
    public Mine(Block block2) {
    		super(block2.getMaterial());
    		block = block2;
            setHardness(0.5F);
            setCreativeTab(com.allforfunmc.refineddiamond.Code.AllForFunTab);
            setResistance(2);
            setBlockName("Mine");
    }
    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int metadata){
    		return block.getIcon(side, metadata);
    }
    @Override
    public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
        float f = 4.0F;
        world.createExplosion(entity, x, y, z, f, true);
    }
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(block);
    }
    @Override
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {   		
        if(!world.isRemote){
        	float f = 4.0F;
        	world.createExplosion(null, x, y+2, z, f, true);
        }
    }
    @Override
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
    	if(ItemStack.areItemStacksEqual(player.getCurrentEquippedItem(), new ItemStack(Code.CreeperPearl))){
    		world.setBlock(x, y, z, block);
    	}
    }
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
    	if(ItemStack.areItemStacksEqual(player.getCurrentEquippedItem(), new ItemStack(Code.CreeperPearl))){
    		world.setBlock(x, y, z, block);
    	}
    	return false;
    }
}