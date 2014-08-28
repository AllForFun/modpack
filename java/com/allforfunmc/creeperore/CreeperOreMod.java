package com.allforfunmc.creeperore;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod (modid="creeperore", name="AllForFun's CreeperOreMod", version="Dev")
public class CreeperOreMod {
	@Instance (value="GenericModID")
	public static CreeperOreMod instance;
	@SidedProxy(clientSide="com.allforfunmc.creeperore.ClientProxy",serverSide="com.allforfunmc.creeperore.CommonProxy")
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