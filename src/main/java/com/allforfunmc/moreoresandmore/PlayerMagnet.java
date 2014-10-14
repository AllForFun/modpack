package com.allforfunmc.moreoresandmore;

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
    public boolean hitEntity(ItemStack stack, EntityLivingBase useingPlayer, EntityLivingBase hitplayer)
    {
		if (hitplayer.isDead){
			return true;
		}
		NBTTagCompound nbt = stack.stackTagCompound;
		if(!nbt.getBoolean("On")){
			nbt.setString("holding", hitplayer.getUniqueID().toString());
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
	public void onUpdate(ItemStack stack, World p_77663_2_, Entity playerAsEntity, int p_77663_4_, boolean p_77663_5_) {
		EntityPlayer player = (EntityPlayer) playerAsEntity;
		try {
			if (Entity.class. .getTagCompound().getString("Holding"))
			if (player.getHeldItem() != stack){
				NBTTagCompound nbt = stack.getTagCompound();
				nbt.setString("holding", "");
				nbt.setBoolean("On", false);
				stack.setTagCompound(nbt);
			}
		} catch(java.lang.NullPointerException e){
			NBTTagCompound nbt = new NBTTagCompound();
		    nbt.setString("holding", "");
		    nbt.setBoolean("On", false);
		    stack.setTagCompound(nbt);
		}
	}
}
