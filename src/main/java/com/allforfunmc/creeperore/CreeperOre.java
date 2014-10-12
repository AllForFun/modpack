package com.allforfunmc.creeperore;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.allforfunmc.allforfuncore.Core;

public class CreeperOre extends Block {
    public CreeperOre(Material material) {
	super(material);
	setHardness(3F);
	setCreativeTab(Core.AllForFunBlocks);
	setBlockTextureName("creeperore:creeper_ore");
	setResistance(2);
	setBlockName("CreeperOre");
    }

    @Override
    public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
	if (!world.isRemote) {
	    float f = 4.0F;
	    world.createExplosion(null, x, y, z, f, true);
	}
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
	return Code.CreeperPearl;
    }
}