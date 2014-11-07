package com.allforfunmc.launcher;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.allforfunmc.allforfuncore.Core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FireballLauncher extends Item {

  public FireballLauncher() {
    super();
    this.setUnlocalizedName("fireballlauncher");
    this.setTextureName("launcher:fireballlauncher");
    this.maxStackSize = 1;
    this.setCreativeTab(Core.AllForFunTools);
  }
  @SideOnly(Side.CLIENT)
  public void addInformation (ItemStack itemStack, EntityPlayer player, List datalist, boolean b){
	     datalist.add("Test Item");
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
	 {
		  par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1F, 0.9F / (itemRand.nextFloat() * 0.4F + 0.8F));
		  if (!par2World.isRemote)
	      {
	          par2World.spawnEntityInWorld(new EntityLargeFireball(par2World, par3EntityPlayer, 0.0D, 0.0D, 0.0D));
	      }
	  }
	  
            
      return par1ItemStack;
  }
}
