package com.allforfunmc.creeperore;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.allforfunmc.allforfuncore.Core;

public class CreeperPickaxe extends ItemPickaxe {

    public CreeperPickaxe(ToolMaterial mat) {
	super(mat);
	setCreativeTab(Core.AllForFunTools);
	this.setTextureName("creeperore:creeper_pickaxe");
	this.setMaxStackSize(1);
	this.setUnlocalizedName("Creeper_Pickaxe");
    }

    @Override
    public boolean onBlockDestroyed(ItemStack pickaxe, World world, Block block, int x, int y, int z, EntityLivingBase entity) {
	if (!world.isRemote) {
	    float f = 10F;
	    world.createExplosion(entity, x, y, z, f, true);
	}
	return true;
    }
}