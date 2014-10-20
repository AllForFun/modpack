package com.allforfunmc.allforfuncore;

import net.minecraft.entity.EntityLivingBase;
/**
 * A class to contain Coordinates.
 * @author penne12
 */
public class Coordinates extends Object{
	//Constructors
	/** A class to contain Coordinates.
	 * @author penne12
	 */
	public Coordinates(double xCoord, double yCoord, double zCoord){
		x = xCoord;
		y = yCoord;
		z = zCoord;
	}public Coordinates(){
		this(0,0,0);
	}	
	/**
	 * Gets entity's coordinates
	 * @param entity
	 */
	public Coordinates(EntityLivingBase entity){
		x = entity.posX;
		y = entity.posY;
		z = entity.posZ;
	}
	//Declarations
	public double x;
	public double y;
	public double z;
	
	/**
	 * Moves entity by Coordinates
	 * @param entity Entity to move.
	 * @param toMove Coordinates to move by.
	 * @author penne12
	 */
	public static void Move(EntityLivingBase entity, Coordinates toMove){
		if(entity.motionX != 0)
			entity.motionX = toMove.x;
		if(entity.motionY != 0)
			entity.motionY = toMove.y;
		if(entity.motionZ != 0)
			entity.motionZ = toMove.z;
	}
	public String toString(){
		return "X: "+x+" Y: "+y+" Z: "+z;
	}
	/**
	 * Multiplies all by -1. 
	 * @return this.
	 */
	public Coordinates reverse(){
		x = x * -1;
		y = y * -1;
		z = z * -1;
		return this;
	}
}
