package com.allforfunmc.emeraldarmor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

import com.allforfunmc.allforfuncore.Core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EmeraldShovel extends ItemSpade{

	public EmeraldShovel(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setCreativeTab(Core.AllForFunTools);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Main.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
