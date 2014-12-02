package com.allforfunmc.allforfuncore.groovyMod

import net.minecraft.block.Block
import net.minecraft.entity.Entity
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.world.Explosion
import net.minecraft.world.World
import net.minecraft.block.material.Material

/**
 * Created by Ben on 11/28/14.
 */
abstract class GBlock extends Block {
    /**
     *
     * @param mat Material of the block
     * @param mod Mod that this block belongs to, to be registered automagically
     * @param safeName Name of the block, safe for /give or /setblock
     */
    GBlock(Material mat, GMod mod, String safeName) {
        super(mat)
        mod.blockRegistry.put(safeName)
    }
    GBlock(Material mat){
        super(mat)
    }
    /**
     * When...
     * - added [world, x, y, z]
     * - destroyed by a player [world, x, y, z, meta]
     * - destroyed by an explosion [world, x, y, z, explosion]
     * - right clicked [world, blockX, blockY, blockZ, (EntityPlayer) player, metadata]
     * - walked on [world, x, y, z, entity]
     */
    def when = [String:{/*Do something*/}]

    private def doEvent(String event) {
       when.get(event)
    }

    //Old methods
    @Override
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
        doEvent("destroyed by a player")(world, x, y, z, meta)
    }
    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        doEvent("added")(world, x, y, z)
    }
    @Override
    public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion explosion) {
        doEvent("destroyed by an explosion")
    }
    @Override
    public boolean onBlockActivated(World world, int BlockX, int BlockY, int BlockZ, EntityPlayer player, int metadata, float unknown1, float unknown2, float unknown3)
    {
        doEvent("right clicked")
    }
    @Override
    public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
        onWalkedOn(world, x, y, z, entity)
    }
    @Override
    public int onBlockPlaced(World p_149660_1_, int p_149660_2_, int p_149660_3_, int p_149660_4_, int p_149660_5_, float p_149660_6_, float p_149660_7_, float p_149660_8_, int p_149660_9_)
    {
        return p_149660_9_;
    }

}
