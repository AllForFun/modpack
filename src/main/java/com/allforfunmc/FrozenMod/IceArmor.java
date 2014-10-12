package com.allforfunmc.FrozenMod;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.allforfunmc.allforfuncore.Core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class IceArmor extends ItemArmor {

    private String texturePath = "sleshymod:textures/models/";

    public IceArmor(ArmorMaterial material, int id, int place) {
	super(material, id, place);

	this.setMaxStackSize(1);
	this.setCreativeTab(Core.AllForFunArmor);
	this.setTextures(place);
    }

    private void setTextures(int part) {
	if (part == 0) {
	    this.setTextureName("sleshymod:Ice_helmet");
	}
	if (part == 1) {
	    this.setTextureName("sleshymod:Ice_chestplate");
	}
	if (part == 2) {
	    this.setTextureName("sleshymod:Ice_leggings");
	}
	if (part == 3) {
	    this.setTextureName("sleshymod:Ice_boots");
	}
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
	if (slot == 0 || slot == 1 || slot == 3) {
	    return "sleshymod:textures/models/ice_layer_1.png";
	} else {
	    return "sleshymod:textures/models/ice_layer_2.png";
	}
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
	this.itemIcon = register.registerIcon("sleshymod:" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
	return this.texturePath;
    }

}