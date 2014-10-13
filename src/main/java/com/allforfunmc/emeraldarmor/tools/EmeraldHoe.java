package com.emeraldarmor.mod.tools;

import com.emeraldarmor.mod.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class EmeraldHoe extends ItemHoe{

	public EmeraldHoe(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setCreativeTab(Main.emeraldarmorTab);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Main.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
