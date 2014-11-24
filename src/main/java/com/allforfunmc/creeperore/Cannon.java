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
	public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
		double xDif = x - entity.posX;
		double zDif = z - entity.posZ;
		for(int i = 0; i >= 99; i++) {
			System.out.println(entity + " is walking.");
			entity.posY = entity.posY + Math.pow(i, 2);
			System.out.println(entity + " is being thrown.");
		}
	}

}
