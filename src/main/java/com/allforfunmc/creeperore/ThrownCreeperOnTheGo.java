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

    public ThrownCreeperOnTheGo(World p_i1773_1_)
    {
        super(p_i1773_1_);
    }

    public ThrownCreeperOnTheGo(World p_i1774_1_, EntityLivingBase p_i1774_2_)
    {
        super(p_i1774_1_, p_i1774_2_);
    }

    public ThrownCreeperOnTheGo(World p_i1775_1_, double p_i1775_2_, double p_i1775_4_, double p_i1775_6_)
    {
        super(p_i1775_1_, p_i1775_2_, p_i1775_4_, p_i1775_6_);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    @Override
    protected void onImpact(MovingObjectPosition MOP){
        float f = 4.0F;
        this.worldObj.createExplosion(null, MOP.blockX, MOP.blockY, MOP.blockZ, f, true);
        
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