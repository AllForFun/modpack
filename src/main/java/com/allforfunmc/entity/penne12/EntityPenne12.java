package com.allforfunmc.entity.penne12;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityPenne12 {
	
	public static void MainRegistry(){
		registerEntity();
	}

	public static void registerEntity() {
		
		createEntity(EntityPenne12Mob.class, "Penne12 Mob", 0x26FF00, 0xF6FF00);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		
		int randomid = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomid);
		EntityRegistry.registerModEntity(entityClass, entityName, randomid, MainRegistry.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);// incomplete if you want to spawn in more areas
		
		createEgg(randomid, solidColor, spotColor);
	
	}
	
	private static void createEgg(int randomid, int solidColor, int spotColor){
		
		EntityList.entityEggs.put(Integer.valueOf(randomid), new EntityList.EntityEggInfo(randomid, solidColor, spotColor));
	}
	

}
