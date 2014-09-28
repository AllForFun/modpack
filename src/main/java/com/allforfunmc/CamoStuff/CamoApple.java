package com.allforfunmc.CamoStuff;

import net.minecraft.item.ItemFood;

public class CamoApple extends ItemFood{
	 
    public CamoApple(int healthGain, float SaturationGain, boolean dogsFavorite) {
            super(healthGain, SaturationGain, dogsFavorite);
            setMaxStackSize(64);
            setUnlocalizedName("camoApple");
            this.setCreativeTab(com.allforfunmc.allforfuncore.Core.AllForFunFood);
            setTextureName("sleshymod:camo_apple");
            setAlwaysEdible();
            this.setPotionEffect(14, 900, 10, 100);
            // ^^ this is optional, so you can eat it while you are at full hunger
    }
    }