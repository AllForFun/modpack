package com.allforfunmc.bottleXp;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod (modid="BottleXp", name="AllForFun's XPBottler", version="1.0")
public class BottleXp {
	@Instance (value="GenericModID")
	public static BottleXp instance;
	@SidedProxy(clientSide="com.allforfunmc.bottleXp.ClientProxy",serverSide="com.allforfunmc.bottleXp.CommonProxy")
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