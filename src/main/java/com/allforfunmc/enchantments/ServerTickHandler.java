package com.allforfunmc.enchantments;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ServerTickHandler {
// note this class registers enchantments for natural minecraft stuff
	
	/*this is for each individual class
	 * 
	 *     @Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
		if(stack.getItem() == MyItems.LightningBoots){
			int j = EnchantmentHelper.getEnchantmentLevel(MainRegistry.speedboost.effectId, stack);
			if(j > 0){
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 50, j - 1));
			}
		}
		
	}
	 * 
	 */
	
	private Minecraft mc;
	
	public ServerTickHandler(Minecraft mc){
		this.mc = mc;
	}
	
	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent event){
		if(event.player.getCurrentArmor(0) != null){
			ItemStack boots = event.player.getCurrentArmor(0);
			
			if(boots.getItem() == Items.diamond_boots || boots.getItem() == Items.golden_boots || boots.getItem() == Items.iron_boots || boots.getItem() == Items.leather_boots || boots.getItem() == Items.chainmail_boots){
				int j = EnchantmentHelper.getEnchantmentLevel(MainRegistry.speedboost.effectId, boots);
				if(j > 0){
					event.player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 50, j - 1));
					
				}
			}
		}	
	}
	
	@SubscribeEvent
	public void onPlayerTick1(PlayerTickEvent event){
		boolean b = event.player.isSwingInProgress;
		boolean d = event.player.isDead;
		if(b && !d){
			ItemStack item = event.player.getCurrentEquippedItem();
			
			if(item.getItem() == Items.diamond_sword || item.getItem() == Items.golden_sword || item.getItem() == Items.iron_sword || item.getItem() == Items.stone_sword || item.getItem() == Items.wooden_sword){
				int a = EnchantmentHelper.getEnchantmentLevel(MainRegistry.explodingarrows.effectId, item);
				if(a > 0){
					
				}
			}
		}	
	}
	
}
