package com.allforfunmc.chocolatestuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ChocolateBar extends ItemFood{
	@Override
    public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player){
        --itemStack.stackSize;
        player.getFoodStats().func_151686_a(this, itemStack);
        world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
        switch (itemStack.getItemDamage()){
        case 0:
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 300 * 20, 3));
            player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), 300 * 20, 3));
        case 1:
            player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 300 * 20, 1));
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 300 * 20, 3));
        case 2:
        	player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 300 * 20, 3));
        	player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 300 * 20, 3));
        }
        return itemStack; 
    }
    public ChocolateBar() {
            super(5, 0, false);
            setMaxStackSize(1);
            setUnlocalizedName("chocolatebar.unknown");
            setTextureName("chocolatestuff:chocolatebar");
            setAlwaysEdible();
            setCreativeTab(CreativeTabs.tabFood);
    }
}
