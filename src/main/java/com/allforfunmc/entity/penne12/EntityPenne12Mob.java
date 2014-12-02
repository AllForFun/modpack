package com.allforfunmc.entity.penne12;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityPenne12Mob extends EntityTameable{

	public EntityPenne12Mob(World par1World) {
		super(par1World);
		
		this.setSize(1.0F, 2.0F);

		this.tasks.addTask(0, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.0F));
		this.tasks.addTask(2, new EntityAITempt(this, 1.0F, Item.getItemFromBlock(Blocks.redstone_block), false));
		this.tasks.addTask(3, new EntityAIFollowOwner(this, 5.0, 1F, 10F));
		this.tasks.addTask(10, new EntityAIWander(this, 0.5F));
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5F);
	}
	public EntityAgeable createChild(EntityAgeable entity) {
		return new EntityPenne12Mob(worldObj);
	}

}
