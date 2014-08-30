package com.allforfunmc.creeperore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CreeperOnTheGo extends Item{
	public CreeperOnTheGo(){
		super();
		setCreativeTab(com.allforfunmc.refineddiamond.Code.AllForFunTab);
		this.setTextureName("creeperore:creeperpearl");
		this.setMaxStackSize(16);
		this.setUnlocalizedName("creeperonthego");
	}
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --itemstack.stackSize;
        }

        world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!world.isRemote)
        {
        	System.out.println("Spawn");
        	world.spawnEntityInWorld(new ThrownCreeperOnTheGo(world, player));
        }

        return itemstack;
    }

}