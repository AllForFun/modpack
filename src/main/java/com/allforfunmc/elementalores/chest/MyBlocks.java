package com.allforfunmc.elementalores.chest;




import com.allforfunmc.allforfuncore.Core;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MyBlocks {
	
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
    
    public static Block camochest;
    
    
    public static void InitBlocks() {
    		
		camochest = new CamoChest(0).setCreativeTab(Core.AllForFunBlocks).setBlockName("camo_chest");
    		
    }

	



    public static void RegisterBlocks() {
	
	
	GameRegistry.registerBlock(camochest, "camo_chest");

	}

}
