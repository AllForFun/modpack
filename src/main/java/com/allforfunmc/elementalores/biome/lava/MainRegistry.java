package com.allforfunmc.elementalores.biome.lava;



import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
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

@Mod(modid = MainRegistry.MODID, name = MainRegistry.NAME, version = MainRegistry.VERSION)
public class MainRegistry 
{
	public static final String MODID = "elementalores";
	public static final String NAME = "Elemental Ores Mod";
	public static final String VERSION = "1.0";
	@SidedProxy(clientSide = "com.allforfunmc.elementalores.biome.lava.ClientProxy", serverSide = "com.allforfunmc.elementalores.biome.lava.CommonProxy")
	public static ServerProxy proxy;
   
    
    @Metadata
    public static ModMetadata meta;
    
    @Instance(MODID)
    public static MainRegistry modInstance;

    
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent event)
    {   	
    	RegisterBiomes();
    	
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
	public static BiomeGenBase biomelava;
	public static void RegisterBiomes(){
		biomelava = new BiomeGenLava(3).setBiomeName("Lava").setTemperatureRainfall(1.2F, 0.9F);
		BiomeDictionary.registerBiomeType(biomelava, Type.FOREST);
		BiomeManager.addSpawnBiome(biomelava);
	}
    
}
