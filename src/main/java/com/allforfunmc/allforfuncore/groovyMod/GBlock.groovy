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

    def onDestroy = {}
    /**
     * Called when this block is added to the world
     * Params: world, x, y, z, explosion
     */
    def onAdded = {}
    /**
     * Called when the block is destroyed by an explosion
     * Params: World, x, y, z, explosion
     */
    def onDestroyedByExplosion = {}
    /**
     * Called when an entity activates, or right clicks, the block.
     * Must return a boolean.
     * Params: World, BlockX, BlockY, BlockZ, player, metadata, unknown1, unknown2, unknown3
     */
    def onRightClick = {}
    /**
     * Called when any entity is walking on this block.
     * Params: world, x, y, z, and the entity that is walking on the block
     */
    def onWalkedOn = {}

    //Old methods
    @Override
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
        onDestroy(world,x,y,z,meta)
    }
    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        onAdded(world, x, y, z)
    }
    @Override
    public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion explosion) {
        onDestroyedByExplosion(world, x, y, z, explosion)
    }
    @Override
    public boolean onBlockActivated(World world, int BlockX, int BlockY, int BlockZ, EntityPlayer player, int metadata, float unknown1, float unknown2, float unknown3)
    {
        onRightClick(world, BlockX, BlockY, BlockZ, player, metadata, unknown1, unknown2, unknown3)
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
