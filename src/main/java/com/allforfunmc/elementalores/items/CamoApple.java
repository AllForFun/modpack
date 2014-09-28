package com.elementalores.items;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.item.ItemFood;

public class CamoApple extends ItemFood{
	 
    public CamoApple(int healthGain, float SaturationGain, boolean dogsFavorite) {
            super(healthGain, SaturationGain, dogsFavorite);
            setMaxStackSize(64);
            setUnlocalizedName("camoApple");
            this.setCreativeTab(BlocksAndItems.moditemsTab);
            setTextureName("sleshymod:camo_apple");
            setAlwaysEdible();
            this.setPotionEffect(14, 900, 10, 100);
            // ^^ this is optional, so you can eat it while you are at full hunger
    }
    }