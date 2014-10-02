package com.allforfunmc.FrozenMod;

import com.allforfunmc.allforfuncore.Core;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IcePick extends ItemPickaxe{
	
	public IcePick(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("ice_pick");
		setCreativeTab(Core.AllForFunTools);
		this.setTextureName("sleshymod:ice_pick");
	}
	@Override
	public boolean onBlockDestroyed(ItemStack p_150894_1_, World world, Block block, int x, int y, int z, EntityLivingBase p_150894_7_)
    {
        if ((double)block.getBlockHardness(world, x, y, z) != 0.0D)
        {
            p_150894_1_.damageItem(1, p_150894_7_);
        }
        if (!Block.isEqualTo(block, Blocks.ice))  {
        	world.setBlock(x, y, z, Blocks.ice);
        }
        return true;
    }

}
