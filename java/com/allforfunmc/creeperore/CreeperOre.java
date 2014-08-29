package com.allforfunmc.creeperore;

import net.minecraft.block.Block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class CreeperOre extends Block {
    public CreeperOre(Material material) {
            super(material);
            setHardness(3F);
            setCreativeTab(com.allforfunmc.refineddiamond.Code.AllForFunTab);
            setBlockTextureName("creeperore:creeper_ore");
            setResistance(2);
            setBlockName("CreeperOre");
    }
    @Override
    public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
        float f = 4.0F;
        world.createExplosion(null, x, y, z, f, true);
    }
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(Blocks.tnt);
    }
}