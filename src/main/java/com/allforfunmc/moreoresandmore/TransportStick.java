package com.allforfunmc.moreoresandmore;

import cofh.api.energy.ItemEnergyContainer;
import com.allforfunmc.allforfuncore.Core;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;


public class TransportStick extends ItemEnergyContainer {
    public TransportStick(){
        super(150000, 1000);
        this.setUnlocalizedName("TeleportStick");
        this.setCreativeTab(Core.AllForFunTools);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
        if(getEnergyStored(stack) <= 1000) {
            extractEnergy(stack, 1000, false);
            double oldx = player.posX; double oldy = player.posY; double oldz = player.posZ;
            player.setPosition(player.getLookVec().xCoord, player.getLookVec().yCoord, player.getLookVec().zCoord);
            // particleName, x, y, z, velX, velY, velZ
            for(int i = 0; i >= 25; i++)
                world.spawnParticle("portal", player.posX, player.posY, player.posZ,
                        oldx - player.posX, oldy - player.posY, oldz - player.posZ);
        }


        return stack;
    }
}
