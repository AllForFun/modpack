package com.allforfunmc.writeStone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;

public class TileEntityReadStone extends TileEntity {

    private int timer = 0;
    private boolean shouldProvidePower;
    File file;

    public void updateEntity() {
	if (file != null) {
	    if (timer == 20) {
		timer = 0;
		try {
		    Scanner scanner = new Scanner(file);
		    if (scanner.next() == "1") {
			shouldProvidePower = true;
		    } else {
			shouldProvidePower = false;
		    }
		    scanner.close();
		} catch (FileNotFoundException e1) {
		    e1.printStackTrace();
		}

	    } else {
		timer++;
	    }
	} else {
	    worldObj.setBlock(xCoord, yCoord + 1, zCoord, Blocks.stone);
	}
    }

    public boolean isShouldProvidePower() {
	return shouldProvidePower;
    }

    public void setShouldProvidePower(boolean shouldProvidePower) {
	this.shouldProvidePower = shouldProvidePower;
    }

    public File getFile() {
	return file;
    }

    public void setFile(File file) {
	this.file = file;
    }

}
