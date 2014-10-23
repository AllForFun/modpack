package com.allforfunmc.enchantments;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){

		FMLCommonHandler.instance().bus().register(new ServerTickHandler(Minecraft.getMinecraft()));
	}

}
