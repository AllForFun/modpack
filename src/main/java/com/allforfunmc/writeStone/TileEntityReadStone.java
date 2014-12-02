package com.allforfunmc.writeStone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.allforfunmc.allforfuncore.Core;
import com.allforfunmc.allforfuncore.Debug;
import com.allforfunmc.allforfuncore.DebugType;

import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityReadStone extends TileEntity {
    public boolean hasFile = false;
    public File File;
    
    public void updateEntity() {
    	try {
		    if (new Scanner(File).nextInt() == 1) {
		    	Debug.info("Providing Power");
		    	worldObj.setBlock(xCoord, yCoord + 1, zCoord, Blocks.redstone_block);
		    } else {
		    	Debug.info("Not Providing Power");
		    	worldObj.setBlockToAir(xCoord, yCoord+1, zCoord);
		    }
		    	Debug.info("Scanned: " + new Scanner(File).nextInt());
		} catch (FileNotFoundException e1) {
		    Debug.Error(e1);
		} catch (NullPointerException e) {
			if(hasFile){
				Debug.Print("Could not find file: " + File.toString(), DebugType.Warning);
			}
		} catch (java.util.NoSuchElementException error){
			Debug.Print("Something went wrong scanning " + error.toString(),DebugType.Error);
		}
	}
    public TileEntityReadStone setFile(File settingFile){
    	File = settingFile;
    	hasFile = true;
		Debug.info("Setting File to" + settingFile.toString());
    	return this;
    }
    public void writeToNBT(NBTTagCompound nbt)
	  {
	    nbt.setString("File", this.File.toString());
	    super.writeToNBT(nbt);
	  }
    public void readFromNBT(NBTTagCompound nbt)
	  {
	    this.File = new File(nbt.getString("File"));
	    super.readFromNBT(nbt);
	  }
}
