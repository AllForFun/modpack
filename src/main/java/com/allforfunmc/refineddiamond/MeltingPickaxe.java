package com.allforfunmc.refineddiamond;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import cofh.api.energy.IEnergyContainerItem;

public class MeltingPickaxe extends ItemPickaxe implements IEnergyContainerItem {

	public int maxCapacity = 50000;
	public int baseCost = 2000;

	public MeltingPickaxe(ToolMaterial mat) {
		super(mat);
		setCreativeTab(com.allforfunmc.refineddiamond.Code.AllForFunTab);
		this.setTextureName("refineddiamondmod:melting_pickaxe");
		this.setMaxStackSize(1);
		this.setUnlocalizedName("MeltingPickaxe");
	}

	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean par4) {
		if (stack.stackTagCompound == null) {
			stack.stackTagCompound = new NBTTagCompound();
		}
		list.add(String.valueOf(stack.stackTagCompound.getInteger("energy")
				+ "/" + maxCapacity));
	}

	@Override
	public boolean onBlockDestroyed(ItemStack pickaxe, World world,
			Block block, int x, int y, int z, EntityLivingBase entity) {

		if (pickaxe.stackTagCompound == null) {
			pickaxe.stackTagCompound = new NBTTagCompound();
		}
		boolean dropDiffernt = true;
		if (!world.isRemote) {
			ItemStack Result = FurnaceRecipes.smelting().getSmeltingResult(
					new ItemStack(block));
			if (Result == null) {
				if (block.getMaterial() == Material.rock) {
					Result = new ItemStack(block);
				} else {
					dropDiffernt = false;

				}
			}
			if (dropDiffernt
					&& pickaxe.stackTagCompound.getInteger("energy") > (baseCost)) {
				world.setBlockToAir(x, y, z);
				EntityItem DroppedResult = new EntityItem(world, (double) x,
						(double) y, (double) z, Result);
				DroppedResult.delayBeforeCanPickup = 10;
				world.spawnEntityInWorld(DroppedResult);
				pickaxe.stackTagCompound.setInteger("energy",
						pickaxe.stackTagCompound.getInteger("energy") - 2000);
			} else {
				pickaxe.damageItem(1, entity);
			}
		}
		return true;
	}

	@Override
	public int receiveEnergy(ItemStack container, int maxReceive,
			boolean simulate) {
		if (container.stackTagCompound == null) {
			container.stackTagCompound = new NBTTagCompound();
		}
		int energy = container.stackTagCompound.getInteger("energy");
		int energyReceived = Math.min(maxCapacity - energy,
				Math.min(250, maxReceive));
		if (!simulate) {
			energy += energyReceived;
			container.stackTagCompound.setInteger("energy", energy);
		}
		return energyReceived;
	}

	private int getDamageFromEnergy(NBTTagCompound tag, int max) {
		return ((int) (Math
				.abs(((float) tag.getInteger("energy") / maxCapacity) - 1) * max) + 1);
	}

	@Override
	public int extractEnergy(ItemStack container, int maxExtract,
			boolean simulate) {
		if (container == null || container.getTagCompound() == null)
			return 0;

		int available = container.stackTagCompound.getInteger("energy");
		int removed;
		if (maxExtract < available) {
			if (!simulate)
				container.stackTagCompound.setInteger("energy", available
						- maxExtract);
			removed = maxExtract;
		} else {
			if (!simulate)
				container.stackTagCompound.setInteger("energy", 0);
			removed = available;
		}
		if (!simulate)
			container.setItemDamage(getDamageFromEnergy(
					container.stackTagCompound, container.getMaxDamage()));

		return removed;
	}

	@Override
	public int getEnergyStored(ItemStack container) {
		if (container == null || container.stackTagCompound == null
				|| !container.stackTagCompound.hasKey("energy"))
			return 0;
		return container.stackTagCompound.getInteger("energy");
	}

	@Override
	public int getMaxEnergyStored(ItemStack container) {
		return maxCapacity;
	}
}