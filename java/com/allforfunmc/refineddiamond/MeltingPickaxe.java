package com.allforfunmc.refineddiamond;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;

public class MeltingPickaxe extends ItemPickaxe{
	
	public MeltingPickaxe(ToolMaterial mat){
		super(mat);
		setCreativeTab(com.allforfunmc.refineddiamond.Code.AllForFunTab);
		this.setTextureName("refineddiamondmod:melting_pickaxe");
		this.setMaxStackSize(1);
		this.setUnlocalizedName("MeltingPickaxe");
	}
	
	@Override
    public boolean onBlockDestroyed(ItemStack pickaxe, World world, Block block, int x, int y, int z, EntityLivingBase entity)
    {
		boolean dropDiffernt = true;
       	if(!world.isRemote){
       		ItemStack Result = FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(block));
       		if (Result == null) {
       				if (block.getMaterial() == Material.rock){Result = new ItemStack(block);}
       				else {dropDiffernt = false;};
       		}
       		if (dropDiffernt){
	       		world.setBlockToAir(x, y, z);
	       		EntityItem DroppedResult = new EntityItem(world, (double)x, (double)y, (double)z, Result);
	            DroppedResult.delayBeforeCanPickup = 10;
	       		world.spawnEntityInWorld(DroppedResult);
       		}
       	}
       	return true;
    }
}