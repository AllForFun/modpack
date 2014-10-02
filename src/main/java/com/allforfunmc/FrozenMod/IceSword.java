package com.allforfunmc.FrozenMod;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class IceSword extends ItemSword{
	
	public IceSword(ToolMaterial mat){
		super(mat);
		setMaxStackSize(1);
		setUnlocalizedName("ice_sword");
		setCreativeTab(Core.AllForFunTools);
		setTextureName("sleshymod:ice_sword");
	}
	@Override
	public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase hit, EntityLivingBase user)
    {
        p_77644_1_.damageItem(1, user);
        if (Core.Random.nextInt(2) == 3){
        	hit.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20,1));
        }
        return true;
    }

}
