package com.allforfunmc.writeStone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.tileentity.TileEntity;

public class TileEntityWriteStone extends TileEntity {

    private int timer = 0;
    File file;

    public File getFile() {
	return file;
    }

    public void setFile(File file) {
	this.file = file;
    }

    public void updateEntity() {
    	int powered = 0;
    	if (worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord)){
    		powered = 1;
    	}
		try{
			file = new File(worldObj.provider.dimensionId + "," + xCoord + "," + yCoord + "," + zCoord + ".txt");
			if(!file.exists()){
				file.createNewFile();
			}else {
				Core.Debug("Writing " + powered);
				Core.Debug("Writing to " + file.toString());
				try {
					if (new Scanner(file).nextInt() != powered){
						FileWriter writer = new FileWriter(file);
						file.createNewFile();
						writer.write(powered + "");
						writer.close();
					}
				}catch(java.util.NoSuchElementException e){
					FileWriter writer = new FileWriter(file);
					file.createNewFile();
					writer.write(powered + "");
					writer.close();
				}
			}
		} catch(IOException e){Core.Debug(e);}
    }
}
