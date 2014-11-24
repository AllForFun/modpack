package com.allforfunmc.creeperore;

import com.allforfunmc.allforfuncore.Core;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;


public class Cannon extends Block {
	public Cannon(){
		super(Material.piston);
		this.setBlockName("playerCannon");
		this.setBlockTextureName("creeperore:playerCannon");
		this.setCreativeTab(Core.AllForFunBlocks);
	}
	@Override
	public void onEntityWalking(World p_149724_1_, int x, int y, int z, Entity entity) {
		xDif = x - entity.posX;
		zDif = z - entity.posZ;
		for (int i = 1; i >= 100; i++)
		entity.motionY
	}

}
