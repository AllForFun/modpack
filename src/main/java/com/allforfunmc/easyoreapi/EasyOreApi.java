package com.allforfunmc.easyoreapi;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod (modid="oreapi", name="AllForFun's EasyOreAPI", version="Dev")
public class EasyOreApi {
	@Instance (value="GenericModID")
	public static EasyOreApi instance;
	@SidedProxy(clientSide="com.allforfunmc.easyoreapi.ClientProxy",serverSide="com.allforfunmc.easyoreapi.CommonProxy")
	public static CommonProxy proxy;
	@EventHandler()
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
	@EventHandler()
	public void Init(FMLInitializationEvent event) {
		
	}
	@EventHandler()
	public void postInit(FMLInitializationEvent event){
	}
}