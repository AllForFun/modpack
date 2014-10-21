package com.allforfunmc.elementalores.chest;



import com.allforfunmc.allforfuncore.Core;

import net.minecraft.block.Block;
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
