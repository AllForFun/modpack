package com.allforfunmc.launcher;

import java.util.List;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SnowballLauncher extends Item {

  public SnowballLauncher() {
    super();
    this.setUnlocalizedName("snowballlauncher");
    this.setTextureName("launcher:snowballlauncher");
    this.maxStackSize = 1;
    this.setCreativeTab(Core.AllForFunTools);
  }
  @SideOnly(Side.CLIENT)
  public void addInformation (ItemStack itemStack, EntityPlayer player, List datalist, boolean b){
	     datalist.add("SNOWBALL FIGHT!");
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
	  if(par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.consumeInventoryItem(Items.snowball)) {
		  par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		  if (!par2World.isRemote)
	      {
	          par2World.spawnEntityInWorld(new EntitySnowball(par2World, par3EntityPlayer));
	      }
	  }
	  
            
      return par1ItemStack;
  }
}
