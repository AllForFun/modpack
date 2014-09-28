package com.allforfunmc.CamoStuff;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;


@Mod (modid="CamoStuff", name="AllForFun's CamoStuff", version="Boilerplate")
public class Main {
	@Instance (value="GenericModID")
	public static Main instance;
	@SidedProxy(clientSide="com.allforfunmc.CamoStuff.ClientProxy",serverSide="com.allforfunmc.CamoStuff.CommonProxy")
	public static CommonProxy proxy;
	@EventHandler()
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
	@EventHandler()
	public void postInit(FMLInitializationEvent event){
		
		
		
		//Crafting
		//Shapeless
	}
}