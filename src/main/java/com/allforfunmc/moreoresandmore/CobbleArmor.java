package com.allforfunmc.moreoresandmore;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CobbleArmor extends ItemArmor{

	private static Object shiftedIndex;

	public CobbleArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		
		this.setCreativeTab(com.allforfunmc.refineddiamond.Code.AllForFunTab);
		
		if(slot == 0) {
			this.setTextureName(Main.modid + ":cobble_helm");
		}else if(slot == 1) {
			this.setTextureName(Main.modid + ":cobble_chest");
		}else if(slot == 2) {
			this.setTextureName(Main.modid + ":cobble_legs");
		}else if(slot == 3) {
			this.setTextureName(Main.modid + ":cobble_boots");
		}
		

	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack) {
					player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 2, 2));
	}
	
		public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
			if (itemstack.getItem() == Main.armorCobbleHelm || itemstack.getItem() == Main.armorCobbleChest || itemstack.getItem() == Main.armorCobbleBoots) {
					return Main.modid + ":textures/models/cobble_layer_1.png";
		} else if (itemstack.getItem() == Main.armorCobbleLegs) {
					return Main.modid + ":textures/models/cobble_layer_2.png";
		} else {
			return null;
		}
	}
}
