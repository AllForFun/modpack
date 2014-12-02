package com.allforfunmc.CamoStuff;

import com.allforfunmc.allforfuncore.Core;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class CamoBlock extends Block implements ITileEntityProvider {
	public CamoBlock(Material mat){
		super(mat);
		setBlockName("camo_block");
		setCreativeTab(Core.AllForFunBlocks);
		this.setHardness(6f);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("sleshymod:camo_block");
	}

	@Override
	public boolean isOpaqueCube(){
		return false;
	}

/*	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(IBlockAccess block, int x, int y, int z, int side){

		return this.getTileEntity(block, x,y,z);
	}*/

	@Override
	public TileEntity createTileEntity(World world, int metadata){
		return ((ITileEntityProvider) this).createNewTileEntity(world, metadata);
	}

	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_){
		return new CamoBlockEntity();
	}
	protected CamoBlockEntity getTileEntity(IBlockAccess blockAccess, int x, int y, int z)
	{
		CamoBlockEntity camoBlockEntity;
		TileEntity TE = blockAccess.getTileEntity(x, y, z);
		if (TE instanceof CamoBlockEntity)
			camoBlockEntity = (CamoBlockEntity) TE;
		else
			camoBlockEntity = null;
		return camoBlockEntity;
	}

}
