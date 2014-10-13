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
    public File File;
    /*
     * TODO: Finish reading of file
     */
    public void updateEntity() {
		try {
		    Scanner scanner = new Scanner(File);
		    if (scanner.next() == "1") {
			shouldProvidePower = true;
		    } else {
			shouldProvidePower = false;
		    }
		    scanner.close();
		} catch (FileNotFoundException e1) {
		    e1.printStackTrace();
		}
	}

    public boolean isShouldProvidePower() {
	return shouldProvidePower;
    }
    public TileEntityReadStone setFile(File settingFile){
    	File = settingFile;
    	return this;
    }
    public void setShouldProvidePower(boolean shouldProvidePower) {
	this.shouldProvidePower = shouldProvidePower;
    }
}
