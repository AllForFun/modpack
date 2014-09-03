package com.allforfunmc.easyoreapi;
 
import java.util.HashMap;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;

import com.allforfunmc.easyoreapi.EasyOre;

import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
 
public class Generator implements IWorldGenerator {
        @Override
        public void generate(Random random, int chunkX, int chunkZ, World world,
                        IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
                /*
                 * runs 'generateNether' or 'generateSurface' depending on which
                 * dimension you're loading
                 */
                switch (world.provider.dimensionId) {
                case -1:
                        generateNether(world, random, chunkX * 16, chunkZ * 16);
                        break;
                case 0:
                        generateSurface(world, random, chunkX * 16, chunkZ * 16);
                        break;
                }
        }
 
        public void generateSurface(World world, Random random, int x, int z) {
        	if(EasyOre.blocksToGenerate.size() != 0){
	        	HashMap maxX = new HashMap(EasyOre.maxX);
	        	HashMap maxZ = new HashMap(EasyOre.maxZ);
	        	HashMap maxVeinSize = new HashMap(EasyOre.maxVeinSize);
	        	HashMap chancesToSpawn = new HashMap(EasyOre.chancesToSpawn);
	        	HashMap minY = new HashMap(EasyOre.minY);
	        	HashMap maxY = new HashMap(EasyOre.maxY);
	        	for(int i = 0;EasyOre.blocksToGenerate.size() < i; i++){
					Block block = EasyOre.blocksToGenerate.get(i);
		            addOreSpawn(block, world, random, x, z,
		            Integer.parseInt((String) maxX.get(block)),
		            Integer.parseInt((String) maxZ.get(block)),
		            Integer.parseInt((String) maxVeinSize.get(block)),
		            Integer.parseInt((String) chancesToSpawn.get(block)),
		            Integer.parseInt((String) minY.get(block)),
		            Integer.parseInt((String) maxY.get(block)));
	        	}
        	}
        }
 
        public void generateNether(World world, Random random, int x, int z) {
        }
 
        public void addOreSpawn(Block block, World world, Random random,
                        int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
                        int chancesToSpawn, int minY, int maxY) {
                for (int i = 0; i < chancesToSpawn; i++) {
                        int posX = blockXPos + random.nextInt(maxX);
                        int posY = minY + random.nextInt(maxY - minY);
                        int posZ = blockZPos + random.nextInt(maxZ);
                        new WorldGenMinable(block, maxVeinSize).generate(world, random,
                                        posX, posY, posZ);
 
                }
 
        }
 
}