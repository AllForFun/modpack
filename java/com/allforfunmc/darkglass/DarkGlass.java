package com.allforfunmc.darkglass;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DarkGlass extends BlockBreakable{

    private static final String __OBFID = "CL_00000249";
	
	public DarkGlass(Material p_i45408_1_, boolean p_i45408_2_) {
		super("glass", p_i45408_1_, p_i45408_2_);
		
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setLightOpacity(1000000);
		this.setHardness(0.3F);
		this.setStepSound(soundTypeGlass);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(Main.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
   public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }
    
   @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
   
    public boolean renderAsNormalBlock()
    {
         return false;
    }
    
    protected boolean canSilkHarvest()
    {
        return true;
    }
    

}
