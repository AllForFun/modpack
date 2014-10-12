package com.allforfunmc.FrozenMod;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import com.allforfunmc.allforfuncore.Core;

public class IceSword extends ItemSword {

    public IceSword(ToolMaterial mat) {
	super(mat);
	setMaxStackSize(1);
	setUnlocalizedName("ice_sword");
	setCreativeTab(Core.AllForFunTools);
	setTextureName("sleshymod:ice_sword");
    }

    @Override
    public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase hit, EntityLivingBase user) {
	p_77644_1_.damageItem(1, user);
	if (Core.Random.nextInt(2) == 3) {
	    hit.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 1));
	}
	return true;
    }

}
