package com.allforfunmc.getwoodback;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = "GetWoodBack", name = "AllForFun's Get Your Wood Back", version = "1.0")
public class GetWoodBack {
    @Instance(value = "GenericModID")
    public static GetWoodBack instance;
    @SidedProxy(clientSide = "com.allforfunmc.getwoodback.ClientProxy", serverSide = "com.allforfunmc.getwoodback.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler()
    public void load(FMLInitializationEvent event) {
	proxy.registerRenderers();
    }

    @EventHandler()
    public void postInit(FMLInitializationEvent event) {
	Code.Crafting();
	Code.Enchantments();
	Code.Smelting();
	Code.Items();
    }
}