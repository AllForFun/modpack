package com.allforfunmc.elementalores.biome.lava;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void MainRegistry(){
		InitializeBiome();
		RegisterBiome();
	}
	
	public static BiomeGenBase biomelava;
	
	public static void InitializeBiome() {
		
		biomelava = new BiomeGenLava(3).setBiomeName("Lava").setTemperatureRainfall(1.2F, 0.9F);
		
	}
	
	public static void RegisterBiome() {
		BiomeDictionary.registerBiomeType(biomelava, Type.FOREST);
		BiomeManager.addSpawnBiome(biomelava);
		
	}


}
