package com.allforfunmc.entity.penne12;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityPenne12 {
	
	public static void MainRegistry(){
		registerEntity();
	}
	
	public static void registerEntity(){
		
		createEntity(EntityPenne12Mob.class, "Penne12 Mob", 0x40FF00, 0xF2FF00);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MainRegistry.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.ambient, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, spotColor);
	}

	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}

}
