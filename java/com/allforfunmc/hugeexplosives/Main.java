package com.allforfunmc.hugeexplosives;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod (modid="hugeexplosives", name="AllForFun's Huge Explosives", version="Main")
public class Main {
	@Instance (value="GenericModID")
	public static Main instance;
	@SidedProxy(clientSide="com.allforfunmc.hugeexplosives.ClientProxy",serverSide="com.allforfunmc.hugeexplosives.CommonProxy")
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