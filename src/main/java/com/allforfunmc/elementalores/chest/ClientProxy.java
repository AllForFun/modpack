package com.allforfunmc.elementalores.chest;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCamoChest.class, new CamoChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MyBlocks.camochest), new ItemRendererCamoChest());
	}

}
