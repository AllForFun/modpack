package com.allforfunmc.elementalores.biome.lava;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ServerTickHandler {

	private Minecraft mc;
	
	public ServerTickHandler(Minecraft mc){
		this.mc = mc;
	}
	
}
