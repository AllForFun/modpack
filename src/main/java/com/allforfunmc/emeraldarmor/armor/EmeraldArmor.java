package com.emeraldarmor.mod.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.emeraldarmor.mod.Main;

public class EmeraldArmor extends ItemArmor{

	private static Object shiftedIndex;
	
	public EmeraldArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		
		this.setCreativeTab(Main.emeraldarmorTab);
		
		if(slot == 0) {
			this.setTextureName(Main.modid + ":EmeraldHelmet");
		}else if(slot == 1) {
			this.setTextureName(Main.modid + ":EmeraldChestplate");
		}else if(slot == 2) {
			this.setTextureName(Main.modid + ":EmeraldLeggings");
		}else if(slot == 3) {
			this.setTextureName(Main.modid + ":EmeraldBoots");
		}
	}
	
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
		if (itemstack.getItem() == Main.armorEmeraldHelmet || itemstack.getItem() == Main.armorEmeraldChestplate || itemstack.getItem() == Main.armorEmeraldBoots) {
				return Main.modid + ":textures/models/emerald_layer_1.png";
	} else if (itemstack.getItem() == Main.armorEmeraldLeggings) {
				return Main.modid + ":textures/models/emerald_layer_2.png";
	} else {
		return null;
	}
}

}
