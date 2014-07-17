package com.allforfunmc.boilerplate;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod (modid="Boilerplate", name="AllForFun's Boilerplate", version="Boilerplate")
public class Boilerplate {
	@Instance (value="GenericModID")
	public static Boilerplate instance;
	@SidedProxy(clientSide="com.allforfunmc.boilerplate.ClientProxy",serverSide="com.allforfunmc.boilerplate.CommonProxy")
	public static CommonProxy proxy;
	@EventHandler()
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
	@EventHandler()
	public void postInit(FMLInitializationEvent event){
		Code.Blocks();
		Code.Crafting();
		Code.Enchantments();
		Code.Smelting();
		Code.Items();
	}
}