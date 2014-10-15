package com.allforfunmc.moreoresandmore;

import com.allforfunmc.allforfuncore.Cordinates;
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
			} else {
				EntityLivingBase EntityHolding = (EntityLivingBase) getEntity(stack, playerAsEntity.worldObj);
				EntityHolding.motionX = playerAsEntity.motionX;
				EntityHolding.motionY = playerAsEntity.motionY;
				EntityHolding.motionZ = playerAsEntity.motionZ;
				if (this.IsClose(stack, player, 5)){
					
				}
				
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
	public Entity getEntity(ItemStack stack, World world){
		Entity entity = world.getEntityByID(stack.getTagCompound().getInteger("holding"));
		return entity;
	}
	public boolean IsOn(ItemStack stack){
		return stack.getTagCompound().getBoolean("On");
	}
	/**
	 * Call to calculate where to move the entity that is being held
	 * @param holding (entity the player is holding)
	 * @param player
	 * @return Double Array with directions to move (0 = x, 1 = y, 2 = z)
	 */
	public double[] MoveCalc(EntityLivingBase holding, EntityPlayer player){
		double x = 0; double y = 0; double z = 0;
		
		
		
		double[] Move = new double[]{x,y,z};
		return Move;
	}
	/**
	 * 
	 * @param HoldingCord
	 * @param HolderCord
	 * @param Close
	 * @return
	 */
	public double Calc(Cordinates HoldingCord, Cordinates HolderCord, double Close){
		double Return = 0;
		if (HoldingCord.x - HolderCord.x >= Close){
			}
		return Return;
	}
}
