package com.allforfunmc.creeperore;

import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    public static HashMap Mines = new HashMap();
    public static Block CreateMine(Block block){
    	if(block == Blocks.tnt){
    		System.out.println("Cannot make a mine out of TNT. Returning null.");
    		return null;
    	} else {
			Block mine = new Mine(block);
			GameRegistry.registerBlock(mine, block.getLocalizedName() + "Mine");
			Mines.put(block, mine);
	    	return mine;
	    	}
    	}
    public static HashMap powerhash = new HashMap();
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_){
		String blockkey = String.valueOf(x)+"."+ String.valueOf(y)+"."+String.valueOf(z);
    	try{
    		Block block = Block.getBlockFromItem(player.getCurrentEquippedItem().getItem());
	    	if(Mines.containsKey(block) && powerhash.containsKey(blockkey)){
	    		if((Integer) powerhash.get(blockkey) >= 5){
	    			ItemStack mine = new ItemStack((Block) Mines.get(block),player.getCurrentEquippedItem().stackSize);
	    			player.setCurrentItemOrArmor(0, mine);
	    			int newpower = (Integer) powerhash.get(blockkey) - 5;
	    			powerhash.put(blockkey, newpower);
	    			System.out.println("Power left: " + newpower);
	    		}
		    	return true;
		    	
	    	} else {
	    		if(player.getCurrentEquippedItem().getItem() == Code.CreeperPearl){
		    		int creeperpearls = player.getCurrentEquippedItem().stackSize;
		        	player.setCurrentItemOrArmor(0, null);
		    		int power = 0;
		    		try{power = (Integer) powerhash.get(blockkey) + creeperpearls;}
		    		catch(NullPointerException e){power = creeperpearls;}
		    		System.out.println("New Power: "+ power);
		    		powerhash.put(blockkey,(Integer) power);
		        	return true;
	    		} else {
	    		return false;
	    		}
	    	}
    	} catch(NullPointerException e) {
	    		System.out.println("Null pointer:");
	    		System.out.println(e);
	    		return false;
    	}
    }
}