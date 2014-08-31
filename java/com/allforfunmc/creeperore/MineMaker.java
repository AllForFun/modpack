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
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

import com.allforfunmc.creeperore.Mine;

public class MineMaker extends Block{
    public MineMaker(Material material) {
            super(material);
            setHardness(3F);
            setCreativeTab(com.allforfunmc.refineddiamond.Code.AllForFunTab);
            setBlockTextureName("creeperore:minemaker");
            setResistance(2);
            setBlockName("MineMaker");
    }
    @Override
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        try{
	    	ItemStack stack = player.getCurrentEquippedItem();
	        Item blockitem = stack.getItem();
	        Block block = Block.getBlockFromItem(blockitem);
	        Block MineBlock = new Mine(block);
	        GameRegistry.registerBlock(MineBlock, block.getLocalizedName() + " Mine");
	        ItemStack mine = new ItemStack(MineBlock);
	        player.setCurrentItemOrArmor(0, mine);
        } catch(cpw.mods.fml.common.LoaderException error){
        	System.out.println("Error! Can't create mine because...");
        	System.out.println(error);
        }
    	return false;
    }
}