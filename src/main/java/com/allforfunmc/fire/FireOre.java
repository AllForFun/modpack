package com.allforfunmc.fire;

import java.util.ArrayList;
import java.util.Random;

import com.allforfunmc.fire.Fire;
import com.allforfunmc.allforfuncore.Core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FireOre extends  Block{
	
	public FireOre (Material mat){
		super(mat);
		setBlockName("fire_ore");
		setCreativeTab(Core.AllForFunBlocks);
		this.setHardness(6f);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("sleshymod:fire_ore");
		this.setLightLevel(2.0f);
	}
    public int getExpDrop(IBlockAccess world, int metadata, int fortune)
    {
        return 3;
    }
    @Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune){
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(Fire.FireCrystal,1));
        if(fortune >= 0 && Core.Random.nextBoolean()) {
        	
        	drops.add(new ItemStack(Fire.FireCrystal,1));
        }
        if(fortune >= 2 && Core.Random.nextBoolean()) {
        	drops.add(new ItemStack(Fire.FireCrystal,1));
        }
        if(fortune >= 3 && drops.size() < 3 && Core.Random.nextBoolean()) {
        	drops.add(new ItemStack(Fire.FireCrystal,1));
        }
        return drops;
	}
    
}
