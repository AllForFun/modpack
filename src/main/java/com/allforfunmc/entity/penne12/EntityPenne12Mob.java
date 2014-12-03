package com.allforfunmc.entity.penne12;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Arrays;


public class EntityPenne12Mob extends EntityTameable {
	public static String getName(){
		return "EntityPenne12";
	}

	public EntityPenne12Mob(World par1World){
		super(par1World);

		this.setSize(1.0F, 2.0F);

		ArrayList<EntityAIBase> tasks = new ArrayList<EntityAIBase>(Arrays.asList(new EntityAIOpenDoor(this, true),
				new EntityAISwimming(this), new EntityAIPanic(this, 1.0F),
				new EntityAITempt(this, 1.0F, Item.getItemFromBlock(Blocks.redstone_block), false),
				new EntityAIFollowOwner(this, 1.0, 1F, 10F), new EntityAIWander(this, 0.5F)));

		int i = 0;
		for(EntityAIBase task : tasks) {
			this.tasks.addTask(i, task);
			i = i++;
		}
	}

	public boolean isAIEnabled(){
		return true;
	}

	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5F);
	}

	public EntityAgeable createChild(EntityAgeable entity){
		return new EntityPenne12Mob(worldObj);
	}
}
