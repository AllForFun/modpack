package com.allforfunmc.fire;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.allforfunmc.allforfuncore.Core;

public class FireOre extends Block {

    public FireOre(Material mat) {
	super(mat);
	setBlockName("fire_ore");
	setCreativeTab(Core.AllForFunBlocks);
	this.setHardness(6f);
	this.setHarvestLevel("pickaxe", 3);
	this.setBlockTextureName("sleshymod:fire_ore");
	this.setLightLevel(2.0f);
    }

    public int getExpDrop(IBlockAccess world, int metadata, int fortune) {
	return 3;
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
	return Core.getOreDrops(Fire.FireCrystal, fortune);
    }

}
