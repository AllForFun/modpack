package com.allforfunmc.CamoStuff

import cpw.mods.fml.relauncher.Side
import cpw.mods.fml.relauncher.SideOnly
import net.minecraft.block.Block
import net.minecraft.block.ITileEntityProvider
import net.minecraft.block.material.Material

import com.allforfunmc.allforfuncore.Core
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.Item
import net.minecraft.util.IIcon
import net.minecraft.world.IBlockAccess
import net.minecraft.world.World
import net.minecraft.tileentity.TileEntity

public class CamoBlock extends Block implements ITileEntityProvider {
	public CamoBlock(Material mat){
		super(mat)
		setBlockName("camo_block")
		setCreativeTab(Core.AllForFunBlocks)
		this.setHardness(6f)
		this.setHarvestLevel("pickaxe", 3)
		this.setBlockTextureName("sleshymod:camo_block")
	}

	@Override
	public boolean isOpaqueCube() {
		false
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(IBlockAccess block, int x, int y, int z, int side)
	{

	}

	@Override
	public TileEntity createTileEntity(World world, int metadata)
	{
		((ITileEntityProvider)this).createNewTileEntity(world, metadata)
	}
	TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_){
		new CamoBlockEntity()
	}
}
