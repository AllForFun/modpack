package com.allforfunmc.elementalores.camochest;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.event.FMLConstructionEvent;

@Mod(modid = "CamoChest", name = "CamoChest by AllForFun", version = "1.0")

public class MainRegistry 
{
	
	@SidedProxy(clientSide = "com.allforfunmc.elementalores.camochest.ClientProxy", serverSide = "com.allforfunmc.elementalores.camochest.ServerProxy")
	public static ServerProxy proxy;
   
    
    @Metadata
    public static ModMetadata meta;
    
    @Instance("GenericModID")
    public static MainRegistry modInstance;
    
    public static Block camochest;

    
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent event)
    {   	
    	camochest = new CamoChest(0).setCreativeTab(Core.AllForFunBlocks).setBlockName("camo_chest");
    	GameRegistry.registerBlock(camochest, "camo_chest");
    	
    	TileEntityCamo.MainRegistry();
    	
    	proxy.registerRenderThings();
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void PostLoad(FMLPostInitializationEvent PostEvent)
    {
    	
    }
    
}
