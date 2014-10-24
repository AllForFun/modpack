package com.allforfunmc.entity.penne12;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPenne12Mob.class, new RenderPenne12Mob(new Penne12(), 0));

	
	}

}
