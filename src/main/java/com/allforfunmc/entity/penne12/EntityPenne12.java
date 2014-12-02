package com.allforfunmc.entity.penne12;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ModContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityPenne12 {


	
	public static void createEntity(){
		EntityPenne12Mob.class.getName();
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityPenne12Mob.class, EntityPenne12Mob.getName(), randomId);
		EntityRegistry.registerModEntity(EntityPenne12Mob.class, EntityPenne12Mob.getName(), randomId, MainRegistry.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(EntityPenne12Mob.class, 2, 0, 1, EnumCreatureType.ambient, BiomeGenBase.forest);

		EntityList.entityEggs.put(randomId, new EntityList.EntityEggInfo(randomId, 0x40FF00, 0xF2FF00));
	}

}
