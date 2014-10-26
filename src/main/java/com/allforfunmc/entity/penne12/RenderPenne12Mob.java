package com.allforfunmc.entity.penne12;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderPenne12Mob extends RenderLiving{
	
	private static final ResourceLocation mobTexture = new ResourceLocation("sleshymod:textures/entities/penne12mob.png");

	public RenderPenne12Mob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}

	protected ResourceLocation getEntityTexture(EntityPenne12Mob entity) {
		
		return mobTexture;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {

		return this.getEntityTexture((EntityPenne12Mob)entity);
	}

}
