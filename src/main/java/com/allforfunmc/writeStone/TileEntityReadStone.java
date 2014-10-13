package com.allforfunmc.writeStone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;

public class TileEntityReadStone extends TileEntity {
    private int timer = 0;
    public boolean hasFile = false;
    public File File;
    
    /*
     * TODO: Finish reading of file
     */
    public void updateEntity() {
    	try {
		    if (new Scanner(File).nextInt() == 1) {
		    	Core.Debug("Providing Power");
		    	worldObj.setBlock(xCoord, yCoord + 1, zCoord, Blocks.redstone_block);
		    } else {
		    	Core.Debug("Not Providing Power");
		    	worldObj.setBlockToAir(xCoord, yCoord+1, zCoord);
		    }
		    	Core.Debug("Scanned: " + new Scanner(File).nextInt());
		} catch (FileNotFoundException e1) {
		    Core.Debug(e1.getStackTrace());
		} catch (NullPointerException e) {
			if(hasFile){
				System.out.println("Could not find file: " + File.toString());
			}
		} catch (java.util.NoSuchElementException error){
			Core.Debug("Something went wrong scanning " + error.toString());
		}
	}
    public TileEntityReadStone setFile(File settingFile){
    	File = settingFile;
    	hasFile = true;
		Core.Debug("Setting File to" + settingFile.toString());
    	Core.Debug("Something went wrong in setting the file (" + File.toString() + ") to " + settingFile.toString());
    	//TODO: Insert NBT here.
    	return this;
    }
}
