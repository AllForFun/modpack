package com.allforfunmc.moreoresandmore;

import com.allforfunmc.allforfuncore.Coordinates;
import com.allforfunmc.allforfuncore.Core;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class PlayerMagnet extends ItemSword{
	static ToolMaterial likeNothing = EnumHelper.addToolMaterial("likeNothing", 0, 999999999, 1F, 0F, 0);
	public PlayerMagnet(){
		super(likeNothing);
		this.setMaxStackSize(1);
	}
	@Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase hitPlayer, EntityLivingBase useingPlayer)
    {
		if(IsOn(stack)){
			nbt(stack);
		} else {
			nbt(stack, hitPlayer.getEntityId());
		}
		Core.Debug("It is " + IsOn(stack) + " that I am holding " + getEntity(stack, hitPlayer.worldObj));
        return true;
    }
	@Override
	public void onUpdate(ItemStack stack, World world, Entity playerAsEntity, int p_77663_4_, boolean p_77663_5_) {
		EntityPlayer player = (EntityPlayer) playerAsEntity;
		try {
			if (this.getEntity(stack, world).isDead){
				nbt(stack);
			}
			if (player.getHeldItem() != stack){
				nbt(stack);
			}
			if (IsOn(stack)){
				Core.Debug("Moving " + getEntity(stack, world));
				Move((EntityLivingBase) getEntity(stack, world),player);
			}
		} catch(java.lang.NullPointerException e){
			nbt(stack);
		}
	}
	private NBTTagCompound nbt(ItemStack stack, int ID, boolean On){
		NBTTagCompound nbt = new NBTTagCompound();
	    nbt.setInteger("holding", ID);
	    nbt.setBoolean("On", On);
	    stack.setTagCompound(nbt);
	    return nbt;
	}
	public NBTTagCompound nbt(ItemStack stack){
		return nbt(stack, -1, false);
	}
	public NBTTagCompound nbt(ItemStack stack, int ID){
		return nbt(stack, ID, true);
	}
	public EntityLivingBase getEntity(ItemStack stack, World world) throws NullPointerException{
		try{
			EntityLivingBase entity = (EntityLivingBase) world.getEntityByID(stack.getTagCompound().getInteger("holding"));
			return entity;
		} catch(java.lang.ClassCastException e){
			nbt(stack);
			return null;
		}
	}
	public boolean IsOn(ItemStack stack){
		return stack.getTagCompound().getBoolean("On");
	}
	/**
	 * Call to calculate where to move the entity that is being held
	 * @param holding (entity the player is holding with their magnet)
	 * @param player (player that is holding the magnet)
	 * @return Double Array with directions to move (0 = x, 1 = y, 2 = z)
	 * @author penne12
	 * @see Coordinates
	 * @see Calc
	 * @see PlayerMagnet
	 */
	public void Move(EntityLivingBase holding, EntityPlayer player){
		Core.Debug(player + " is moving " + holding);
		Coordinates holdingCords = new Coordinates(holding);
		Core.Debug("HoldingCords" + holdingCords);
		Coordinates holderCords = new Coordinates(player);
		Core.Debug("HolderCords" + holderCords);
		Coordinates MoveBy = Calc(holdingCords, holderCords, 5);
		Coordinates.Move(holding, MoveBy);
	}
	/**
	 * Calculates how to move entity based on the following
	 * @param HoldingCord
	 * @param HolderCord
	 * @param Close
	 * @return A coordinates variable to run further testing on
	 * @author penne12
	 * @see Move
	 */
	public static Coordinates Calc(Coordinates holdingCords, Coordinates holderCords, double Close){
		Coordinates Return = new Coordinates();
		double temp = 0;
		if (Math.abs(holdingCords.x - holderCords.x) >= Close){
			temp = ((holdingCords.z - holderCords.z) / 4);
			Core.Debug(temp);
			Return.x = temp;
		}
		if (Math.abs(holdingCords.y - holderCords.y) >= Close){
			temp = ((holdingCords.y - holderCords.y) / 4);
			Core.Debug(temp);
			Return.y = temp;
		}
		if (Math.abs(holdingCords.z - holderCords.z) >= Close){
			temp = ((holdingCords.z - holderCords.z) / 4);
			Core.Debug(temp);
			Return.z = temp;
		}
		return Return;
	}
	
}
