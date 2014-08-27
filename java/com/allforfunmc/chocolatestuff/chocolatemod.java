package com.allforfunmc.chocolatestuff;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod (modid="chocolatestuff", name="Chocolate Stuff", version="Dev")
public class chocolatemod {
	@Instance (value="GenericModID")
	public static chocolatemod instance;
	@SidedProxy(clientSide="com.allforfunmc.chocolatestuff.ClientProxy",serverSide="com.allforfunmc.chocolatestuff.CommonProxy")
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