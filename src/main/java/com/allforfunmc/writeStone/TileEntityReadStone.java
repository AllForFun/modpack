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
    private boolean shouldProvidePower;
    public boolean hasFile = false;
    public File File;
    /*
     * TODO: Finish reading of file
     */
    public void updateEntity() {
		
    	try {
		    if (new Scanner(File).nextInt() == 1) {
			shouldProvidePower = true;
		    } else {
			shouldProvidePower = false;
		    }
		    if(Core.DebugMode){
		    	System.out.println("Scanned: " + new Scanner(File).nextInt());
		    }
		} catch (FileNotFoundException e1) {
		    e1.printStackTrace();
		} catch (NullPointerException e) {
			if(hasFile){
				System.out.println("Could not find file: " + File.toString());
				if(Core.DebugMode){
					e.printStackTrace();
				}
			}
		} catch (java.util.NoSuchElementException error){
			if(Core.DebugMode){
				System.out.println("Something went wrong scanning " + error.toString());
			}
		}
	}

    public boolean isShouldProvidePower() {
	return shouldProvidePower;
    }
    public TileEntityReadStone setFile(File settingFile){
    	File = settingFile;
    	hasFile = true;
    	if(Core.DebugMode){
    		System.out.println("Setting File to" + settingFile.toString());
    		if (File != settingFile){
    			System.out.println("Something went wrong in setting the file (" + File.toString() + ") to " + settingFile.toString());
    		}
    	}
    	return this;
    }
    public void setShouldProvidePower(boolean shouldProvidePower) {
	this.shouldProvidePower = shouldProvidePower;
    }
}
