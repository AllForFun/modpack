package com.allforfunmc.refineddiamond;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = "refineddiamondmod", name = "AllForFun's Refined Diamond", version = "1")
public class refineddiamondmod {
    public String modid = "refineddiamondmod";

    @Instance(value = "GenericModID")
    public static refineddiamondmod instance;
    @SidedProxy(clientSide = "com.allforfunmc.refineddiamond.ClientProxy", serverSide = "com.allforfunmc.refineddiamond.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler()
    public void load(FMLInitializationEvent event) {
	proxy.registerRenderers();
    }

    @EventHandler()
    public void postInit(FMLInitializationEvent event) {
	Code.Items();
    }
}