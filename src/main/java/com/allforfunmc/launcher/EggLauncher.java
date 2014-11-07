package com.allforfunmc.launcher;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.allforfunmc.allforfuncore.Core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EggLauncher extends Item {

  public EggLauncher() {
    super();
    this.setUnlocalizedName("egglauncher");
    this.setTextureName("launcher:egglauncher");
    this.maxStackSize = 1;
    this.setCreativeTab(Core.AllForFunTools);
  }
  @SideOnly(Side.CLIENT)
  public void addInformation (ItemStack itemStack, EntityPlayer player, List datalist, boolean b){
	     datalist.add("Hey guys, lets egg Notch's house!");
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
	  if(par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.consumeInventoryItem(Items.egg)) {
		  par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1F, 0.9F / (itemRand.nextFloat() * 0.4F + 0.8F));
		  if (!par2World.isRemote)
	      {
	          par2World.spawnEntityInWorld(new EntityEgg(par2World, par3EntityPlayer));
	      }
	  }
	  
            
      return par1ItemStack;
  }
}
