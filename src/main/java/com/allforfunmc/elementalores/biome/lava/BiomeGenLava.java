package com.allforfunmc.elementalores.biome.lava;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenLava extends BiomeGenBase{
	
	public BiomeGenLava(int id){
		super(id);
		
		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 20;
		this.theBiomeDecorator.bigMushroomsPerChunk = 20;
		this.theBiomeDecorator.cactiPerChunk = 10;
		this.theBiomeDecorator.sandPerChunk = 50;
		this.theBiomeDecorator.reedsPerChunk = 10;
		this.theBiomeDecorator.clayPerChunk = 20;
		this.theBiomeDecorator.deadBushPerChunk = 10;
		this.theBiomeDecorator.flowersPerChunk = 40;
		this.theBiomeDecorator.generateLakes = true;
		this.theBiomeDecorator.mushroomsPerChunk = 10;
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityBat.class, 10, 2, 10));
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class, 10, 2, 10));
		this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityPig.class, 10, 2, 10));
		this.spawnableCaveCreatureList.add(new SpawnListEntry(EntitySheep.class, 10, 2, 10));
		this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityCow.class, 10, 2, 10));
		this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityChicken.class, 10, 2, 10));
		this.spawnableWaterCreatureList.add(new SpawnListEntry(EntitySquid.class, 10, 2, 10));
		
		
		this.topBlock =Blocks.grass;
		this.fillerBlock = Blocks.lava;
	}

}
