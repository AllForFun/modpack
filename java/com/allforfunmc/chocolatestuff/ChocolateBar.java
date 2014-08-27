package com.allforfunmc.chocolatestuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
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
        player.addPotionEffect(new PotionEffect(1, 300 * 20, 3));
        player.addPotionEffect(new PotionEffect(18, 300 * 20, 3));
        return itemStack;
    }
    public ChocolateBar(int healthGain, float SaturationGain, boolean dogsFavorite) {
            super(healthGain, SaturationGain, dogsFavorite);
            setMaxStackSize(1);
            setUnlocalizedName("chocolateBar");
            setTextureName("chocolatestuff:chocolatebar");
            setAlwaysEdible();
            setCreativeTab(CreativeTabs.tabFood);
    }
}
