package com.allforfunmc.creeperore;

import com.sun.tools.internal.ws.processor.generator.Names;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CreeperOnTheGo extends Item{
	/**
	 * A flying entity that is awesome.<br>
	 * Dedicated to creaperonthego (you'll find him playing towny on lobby.muttsworldmine.com)
	*/
	public CreeperOnTheGo(){
		super();
		setCreativeTab(com.allforfunmc.refineddiamond.Code.AllForFunTab);
		this.setTextureName("creeperore:creeperpearl");
		
	}
	@Override
	public int getItemStackLimit(ItemStack stack){
		return 12 - stack.getItemDamage();
	}
	/** 
	 * Get pearlNames in an array
	 */
	public static String[] getPearlNames(){
		String[] names = new String[11];
		names[0] = "Tiny";
		names[1] = "Smallest";
		names[2] = "Smaller";
		names[3] = "Small";
		names[4] = "Normal";
		names[5] = "Big";
		names[6] = "Bigger";
		names[7] = "Biggest";
		names[8] = "Huge";
		names[9] = "Huger";
		names[10] = "Nuke";
		return names;
	}
	
	/**
	 * Get id of a pearl based on it's name 
	 */
	
	public static int getPearlID(String name){
		int id = -1;
		for(int i = 0; i > CreeperOnTheGo.getPearlNames().length; i++){
			if (CreeperOnTheGo.getPearlNames()[i] == name) {
				id = i;
			}
		}
		return id;
	}
	/*
	 * Get damage value unlocalized name for pearls 
	 * 
	 */
	@Override
    public String getUnlocalizedName(ItemStack stack){
        return "item.creeperonthego." + this.getPearlNames()[stack.getItemDamage()];
    }
	/*
	 * Spawns thrownCreaperOnTheGo with power chosen from damage value.
	 * 
	 */
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --itemstack.stackSize;
        }

        world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!world.isRemote)
        {
        	float itemDamage = itemstack.getItemDamage();
        	float power = 0;
        	if (itemDamage == 0) {
        		power = 0.1F;
        	} else if (itemDamage <= 4) {
        		power = itemDamage;
        	} else if (itemDamage <= 7) {
        		power = itemDamage * 4;
        	} else if (itemDamage <= 9) {
        		power = itemDamage * 10;
        	} else if (itemDamage == 10) {
        		System.out.println("Nuke thrown. Expect lag.");
        		power = 1000;
        	} else {
        		throw (new java.lang.IllegalArgumentException("Cannot please use a damage value between 0 and 10 for your creeper pearl"));
        	}
        	world.spawnEntityInWorld(new ThrownCreeperOnTheGo(world, player, power));
        }

        return itemstack;
    }

}