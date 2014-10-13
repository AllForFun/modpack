package com.allforfunmc.emeraldarmor;

import com.allforfunmc.allforfuncore.Core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class EmeraldHoe extends ItemHoe{

	public EmeraldHoe(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setCreativeTab(Core.AllForFunTools);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Main.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
