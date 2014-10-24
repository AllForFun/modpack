package com.allforfunmc.entity.penne12;



import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.AchievementPage;

import cpw.mods.fml.common.FMLCommonHandler;
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

@Mod(modid = "sleshymod2", name = "Elemental Ores Mod", version = "1.0")
public class MainRegistry 
{
	
	@SidedProxy(clientSide = "com.elementalores.ClientProxy", serverSide = "com.elementalores.ServerProxy")
	public static ServerProxy proxy;
   
    
    @Metadata
    public static ModMetadata meta;
    
    @Instance("sleshymod")
    public static MainRegistry modInstance;
    

    @EventHandler
    public void PreLoad(FMLPreInitializationEvent event)
    {   	
    	EntityPenne12.MainRegistry();
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
