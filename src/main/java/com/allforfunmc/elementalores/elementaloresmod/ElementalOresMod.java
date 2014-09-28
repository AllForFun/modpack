package com.elementalores.elementaloresmod;



import com.elementalores.lib.Strings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION)
public class ElementalOresMod
{
   
    
    @Metadata
    public static ModMetadata meta;
    
    @Instance(Strings.MODID)
    public static ElementalOresMod modInstance;
    
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent event)
    {
    	Items.MainRegistry();
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
