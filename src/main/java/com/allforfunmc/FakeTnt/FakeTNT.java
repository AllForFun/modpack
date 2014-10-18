package com.allforfunmc.FakeTnt;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class FakeTNT extends Block{
	public FakeTNT(/*NO args*/){
		super(Material.tnt);
		this.setBlockName("Fake_TNT");
		this.setHardness(0F);
		this.setLightLevel(1F);
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}
	@Override
	@SideOnly(Side.CLIENT)
	 public IIcon getIcon(int side, int meta){
		return Blocks.tnt.getIcon(side, meta);
	}
	@Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
		ItemStack stack = player.getCurrentEquippedItem();
		try{
			if (stack.getItem().equals(Item.getItemFromBlock(Blocks.tnt))){
				stack.stackSize--;
				world.setBlock(x, y, z, Blocks.tnt);
				return true;
			} else
				return false;
	    } catch (java.lang.ClassCastException e){
	    	return false;
	    }
    }
}