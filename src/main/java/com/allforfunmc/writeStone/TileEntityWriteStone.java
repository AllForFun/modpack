package com.allforfunmc.writeStone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import net.minecraft.tileentity.TileEntity;

public class TileEntityWriteStone extends TileEntity {

    private int timer = 0;
    File file;

    public void updateEntity() {
	if (timer == 20) {
	    timer = 0;
	    file = new File(xCoord + "," + yCoord + "," + zCoord + ".txt");
	    try {
		file.createNewFile();
	    } catch (IOException e1) {
		e1.printStackTrace();
	    }
	    if (worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord)) {

		try {

		    FileWriter writer = new FileWriter(file);
		    writer.write("1");
		    writer.close();
		} catch (IOException e) {

		    e.printStackTrace();
		}
	    } else {
		try {
		    FileWriter writer = new FileWriter(file);
		    writer.write("0");
		    writer.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    }

	} else {
	    timer++;
	}

    }
}
