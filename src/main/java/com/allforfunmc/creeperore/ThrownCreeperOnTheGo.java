package com.allforfunmc.creeperore;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ThrownCreeperOnTheGo extends EntityThrowable
{
    private static final String __OBFID = "CL_00001722";

    public float explosionPower = 0F;
    public ThrownCreeperOnTheGo(World p_i1774_1_, EntityLivingBase p_i1774_2_, float power)
    {
        super(p_i1774_1_, p_i1774_2_);
        explosionPower = power;
    }


    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    @Override
    protected void onImpact(MovingObjectPosition MOP){
        this.worldObj.createExplosion(null, MOP.blockX, MOP.blockY, MOP.blockZ, explosionPower, true);
        
    	if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
    @Override
    protected float getGravityVelocity()
    {
        return 0;
    }
}