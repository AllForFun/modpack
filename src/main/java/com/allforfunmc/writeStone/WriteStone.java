package com.allforfunmc.writeStone;

import java.io.File;
import java.io.IOException;

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
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "writestone", name = "AllForFun's WriteStone", version = "1")
public class WriteStone {
    public static Block writeStone;
    public static Block readStone;
    public static File file;
    @Instance(value = "GenericModID")
    public static WriteStone instance;

    public File getFile() {
	return file;
    }

    public void setFile(File file) {
	this.file = file;
    }

    @EventHandler()
    public void load(FMLPreInitializationEvent event) {
	file = event.getModConfigurationDirectory();
	try {
	    file.createNewFile();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    @EventHandler()
    public void postInit(FMLInitializationEvent event) {
	writeStone = new BlockWriteStone();
	writeStone.setCreativeTab(CreativeTabs.tabRedstone).setBlockName("Write Stone").setBlockTextureName("writestone:Write_Stone");
	GameRegistry.registerBlock(writeStone, "Write_Stone");
	GameRegistry.registerTileEntity(TileEntityWriteStone.class, "Write_Stone");

	readStone = new BlockReadStone();
	readStone.setCreativeTab(CreativeTabs.tabRedstone).setBlockName("Read Stone").setBlockTextureName("writestone:Read_Stone");
	GameRegistry.registerBlock(readStone, "Read_Stone");
	GameRegistry.registerTileEntity(TileEntityReadStone.class, "Read_Stone");

    }
}