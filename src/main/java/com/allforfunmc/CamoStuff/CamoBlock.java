package com.allforfunmc.CamoStuff;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;

import com.allforfunmc.allforfuncore.Core;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.tileentity.TileEntity;

public class CamoBlock extends Block {
	public CamoBlock(Material mat){
		super(mat);
		setBlockName("camo_block");
		setCreativeTab(Core.AllForFunBlocks);
		this.setHardness(6f);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("sleshymod:camo_block");
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	{

		world.setBlockMetadataWithNotify(x, y, z, Item.getIdFromItem(player.getHeldItem().getItem()),3);
		return true;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(IBlockAccess block, int x, int y, int z, int side)
	{
		return this.createTileEntity()
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata)
	{
		return ((ITileEntityProvider)this).createNewTileEntity(world, metadata);
	}
}
