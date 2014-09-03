package com.allforfunmc.moreoresandmore;

import com.allforfunmc.moreoresandmore.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class CompressedCobble extends Block{

	public CompressedCobble(Material material) {
		super(material);
		
		this.setCreativeTab(com.allforfunmc.refineddiamond.Code.AllForFunTab);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(Main.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}