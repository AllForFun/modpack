package com.allforfunmc.elementalores.biome.lava;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		

		FMLCommonHandler.instance().bus().register(new ServerTickHandler(Minecraft.getMinecraft()));
	}

}
