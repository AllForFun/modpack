package com.allforfunmc.moreoresandmore;

import com.allforfunmc.allforfuncore.Core;
import com.allforfunmc.allforfuncore.Players;

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
    public boolean hitEntity(ItemStack stack, EntityLivingBase useingPlayer, EntityLivingBase hitplayer)
    {
		if (hitplayer.isDead){
			return true;
		}
		if(!nbt.getBoolean("On")){
			nbt.setInteger("holding", hitplayer.getEntityId());
			nbt.setBoolean("On", true);
		} else{
			nbt.setString("holding", "");
			nbt.setBoolean("On", false);
		}
		Core.Debug("It is " + nbt.getBoolean("On") + " that I am holding " + nbt.getString("holding") );
		stack.setTagCompound(nbt);
        return true;
    }
	@Override
	public void onUpdate(ItemStack stack, World world, Entity playerAsEntity, int p_77663_4_, boolean p_77663_5_) {
		EntityPlayer player = (EntityPlayer) playerAsEntity;
		try {
			if (this.getEntity(stack, world) == null){
				nbt(stack);
			}
			if (player.getHeldItem() != stack){
				nbt(stack);
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
	private Entity getEntity(ItemStack stack, World world){
		Entity entity = world.getEntityByID(stack.getTagCompound().getInteger("holding"));
		return entity;
	}
	public IsOn(ItemStack stack){
		return stack.getTagCompound().getBoolean(p_74767_1_)
	}
}
