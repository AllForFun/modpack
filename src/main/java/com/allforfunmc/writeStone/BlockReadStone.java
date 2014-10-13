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

    public boolean onBlockActivated(final World world, final int x, final int y, final int z, EntityPlayer player, int metadata, float hitX, float hitY, float hitZ) {
	if (!world.isRemote) {
	    final JFrame frame = new JFrame();
	    final JFileChooser file = new JFileChooser(Minecraft.getMinecraft().mcDataDir.getAbsoluteFile());
	    frame.setSize(500, 500);
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	    frame.setAlwaysOnTop(true);
	    frame.add(file);
	    file.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
		    frame.dispose();
		    PlaceTile(world, x, y, z, file);
		}
	    });

	}
	return true;
    }
    public static void PlaceTile(World world, int x, int y, int z, JFileChooser file){
    	TileEntityReadStone tile = (new TileEntityReadStone()).setFile(file.getSelectedFile());
	    world.setTileEntity(x, y, z, tile);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
	return new TileEntityReadStone();
    }
}
