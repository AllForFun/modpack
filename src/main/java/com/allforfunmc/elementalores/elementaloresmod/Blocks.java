package com.elementalores.elementaloresmod;

import com.elementalores.blocks.CamoBlock;
import com.elementalores.blocks.CamoOre;
import com.elementalores.blocks.EarthBlock;
import com.elementalores.blocks.EarthOre;
import com.elementalores.blocks.FireBlock;
import com.elementalores.blocks.FireOre;
import com.elementalores.blocks.IceBlock;
import com.elementalores.blocks.IceOre;
import com.elementalores.blocks.LightningBlock;
import com.elementalores.blocks.LightningOre;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
	
	public static void MainRegistry(){
		InitBlocks();
		RegisterBlocks();
		
	}
	



	//Block registries
    public static Block fireore;

    public static Block fireblock;

    public static Block iceore;

    public static Block iceblock;

    public static Block earthore;

    public static Block earthblock;

    public static Block camoore;

    public static Block camoblock;

    public static Block lightningore;

    public static Block lightningblock;
    
    
    public static void InitBlocks() {
    		
    	fireore = new FireOre(Material.rock);
		fireblock = new FireBlock(Material.rock);
		iceore = new IceOre(Material.rock);
		iceblock = new IceBlock(Material.rock);
		earthore = new EarthOre(Material.rock);
		earthblock = new EarthBlock(Material.rock);
		lightningore = new LightningOre(Material.rock);
		lightningblock = new LightningBlock(Material.rock);
		camoore = new CamoOre(Material.rock);
		camoblock = new CamoBlock(Material.rock);
    		
    }

	



    public static void RegisterBlocks() {
	
	GameRegistry.registerBlock(fireore, "fire_ore");
	GameRegistry.registerBlock(iceore, "ice_ore");
	GameRegistry.registerBlock(earthore, "earth_ore");
	GameRegistry.registerBlock(lightningore, "lightning_ore");
	GameRegistry.registerBlock(camoore, "camo_ore");
	GameRegistry.registerBlock(fireblock, "fire_block");
	GameRegistry.registerBlock(camoblock, "camo_block");
	GameRegistry.registerBlock(lightningblock, "lightning_block");
	GameRegistry.registerBlock(iceblock, "ice_block");
	GameRegistry.registerBlock(earthblock, "earth_block");
	
	}

}
