package com.allforfunmc.lava;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod (modid="lava", name="AllForFun's Lava Crafting", version="1")
public class lava {
	@Instance (value="GenericModID")
	public static lava instance;
	@SidedProxy(clientSide="com.allforfunmc.lava.ClientProxy",serverSide="com.allforfunmc.lava.CommonProxy")
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