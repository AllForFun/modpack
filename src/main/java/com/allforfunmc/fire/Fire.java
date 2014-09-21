package com.allforfunmc.fire;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod (modid="Fire", name="AllForFun's Fire", version="1")
public class Fire {
	@Instance (value="GenericModID")
	public static Fire instance;
	@SidedProxy(clientSide="com.allforfunmc.fire.ClientProxy",serverSide="com.allforfunmc.fire.CommonProxy")
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