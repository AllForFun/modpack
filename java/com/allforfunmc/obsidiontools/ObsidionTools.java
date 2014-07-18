package com.allforfunmc.obsidiontools;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod (modid="ObsidionTools", name="AllForFun's Obsidion Tools", version="Alpha")
public class ObsidionTools {
	@Instance (value="GenericModID")
	public static ObsidionTools instance;
	@SidedProxy(clientSide="com.allforfunmc.obsidiontools.ClientProxy",serverSide="com.allforfunmc.obsidiontools.CommonProxy")
	public static CommonProxy proxy;
	@EventHandler()
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
	@EventHandler()
	public void postInit(FMLInitializationEvent event){
		Code.Blocks();
		Code.Items();
		Code.Crafting();
		Code.Enchantments();
		Code.Smelting();
	}
}