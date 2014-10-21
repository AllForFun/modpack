package com.allforfunmc.elementalores.biome.lava;



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

@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION)
public class MainRegistry 
{
	
	@SidedProxy(clientSide = "com.elementalores.ClientProxy", serverSide = "com.elementalores.ServerProxy")
	public static ServerProxy proxy;
   
    
    @Metadata
    public static ModMetadata meta;
    
    @Instance(Strings.MODID)
    public static MainRegistry modInstance;

    
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent event)
    {   	
    	
    	BiomeRegistry.MainRegistry();
    	
    	proxy.registerRenderThings();
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void PostLoad(FMLPostInitializationEvent PostEvent)
    {
    	
    	WorldType LAVA = new WorldTypeLava(3, "lava");
    	
    }
    
}
