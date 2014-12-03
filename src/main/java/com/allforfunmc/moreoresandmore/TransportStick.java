package com.allforfunmc.moreoresandmore;

import cofh.api.energy.ItemEnergyContainer;
import com.allforfunmc.allforfuncore.Core;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class TransportStick extends ItemEnergyContainer {
    public TransportStick(){
        super(150000, 1000);
        this.setUnlocalizedName("TeleportStick");
        this.setCreativeTab(Core.AllForFunTools);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World p_77659_2_, EntityPlayer player){
        if(getEnergyStored(stack) <= 1000) {
            extractEnergy(stack, 1000, false);
            player.setPosition(player.getLookVec().xCoord, player.getLookVec().yCoord, player.getLookVec().zCoord);
        }


        return null;
    }
}
