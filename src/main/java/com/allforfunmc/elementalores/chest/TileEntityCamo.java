package com.allforfunmc.elementalores.chest;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityCamo {
	
	public static void MainRegistry(){
		registerTileEntities();
	}

	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityCamoChest.class, Strings.MODID);
		
	}

}
