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
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityPenne12Mob.class, EntityPenne12Mob.getName(), randomId);
		EntityRegistry.registerModEntity(EntityPenne12Mob.class, EntityPenne12Mob.getName(), randomId, "AllForFunsPenne12AI", 64, 1, true);

		EntityList.entityEggs.put(randomId, new EntityList.EntityEggInfo(randomId, 0x40FF00, 0xF2FF00));
	}

}
