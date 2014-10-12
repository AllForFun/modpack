package com.allforfunmc.writeStone;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;

import scala.swing.FileChooser;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockReadStone extends Block implements ITileEntityProvider {

    protected BlockReadStone() {
	super(Material.redstoneLight);

    }

    public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side) {
	return true;
    }

    public int isProvidingStrongPower(IBlockAccess world, int x, int y, int z, int par5) {
	TileEntityReadStone tile = (TileEntityReadStone) world.getTileEntity(x, y, z);
	if (tile.isShouldProvidePower()) {
	    return 15;
	} else
	    return 0;

    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int metadata, float hitX, float hitY, float hitZ) {
	if (!world.isRemote) {
	    final JFrame frame = new JFrame();
	    JFileChooser file = new JFileChooser(Minecraft.getMinecraft().mcDataDir.getAbsoluteFile());
	    frame.setSize(500, 500);
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	    frame.setAlwaysOnTop(true);
	    frame.add(file);
//	    file.addActionListener(new ActionListener() {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//
//		    frame.dispose();
//		}
//	    });
	    TileEntityReadStone tile = (TileEntityReadStone) world.getTileEntity(x, y, z);
	    tile.setFile(file.getSelectedFile());
	}
	return true;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
	return new TileEntityReadStone();
    }
}
