package com.allforfunmc.CamoStuff;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.allforfunmc.allforfuncore.Core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CamoOre extends Block {

    public CamoOre(Material mat) {
	super(mat);
	setBlockName("camo_ore");
	setCreativeTab(Core.AllForFunBlocks);
	this.setHardness(6f);
	this.setHarvestLevel("pickaxe", 3);
	this.setBlockTextureName("sleshymod:camo_ore");
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
	ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	drops.add(new ItemStack(Main.CamoGem, 1));
	if (fortune >= 0 && Core.Random.nextBoolean()) {

	    drops.add(new ItemStack(Main.CamoGem, 1));
	}
	if (fortune >= 2 && Core.Random.nextBoolean()) {
	    drops.add(new ItemStack(Main.CamoGem, 1));
	}
	if (fortune >= 3 && drops.size() < 3 && Core.Random.nextBoolean()) {
	    drops.add(new ItemStack(Main.CamoGem, 1));
	}
	return drops;
    }

}
