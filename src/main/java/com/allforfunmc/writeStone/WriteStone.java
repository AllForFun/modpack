package com.allforfunmc.writeStone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "writestone", name = "AllForFun's WriteStone", version = "1")
public class WriteStone {
    public static Block writeStone;
    @Instance(value = "GenericModID")
    public static WriteStone instance;

    @EventHandler()
    public void load(FMLInitializationEvent event) {
    }

    @EventHandler()
    public void postInit(FMLInitializationEvent event) {
	writeStone = new BlockWriteStone();
	writeStone.setCreativeTab(CreativeTabs.tabRedstone).setBlockName("Write Stone").setBlockTextureName("writestone:Write_Stone");
	GameRegistry.registerBlock(writeStone, "Write_Stone");
	GameRegistry.registerTileEntity(TileEntityWriteStone.class, "Write_Stone");

	GameRegistry.addShapelessRecipe(new ItemStack(writeStone, 1), new Object[] { Blocks.redstone_block, Items.writable_book });
    }
}