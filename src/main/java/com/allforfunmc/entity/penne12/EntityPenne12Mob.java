package com.allforfunmc.entity.penne12;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityPenne12Mob extends EntityAnimal{

	public EntityPenne12Mob(World par1world) {
		super(par1world);
		this.setSize(1F, 2F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
		this.tasks.addTask(1,  new EntityAIPanic(this, 0.75D));
		this.tasks.addTask(2, new EntityAITempt(this, 1.0D, Items.diamond, false));
	
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		
		return new EntityPenne12Mob(worldObj);
	}

}
