package com.allforfunmc.FireSword;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = "FireSword", name = "AllForFun's FireSword", version = "1")
public class FireSword {
    @Instance(value = "GenericModID")
    public static FireSword instance;
    @SidedProxy(clientSide = "com.allforfunmc.FireSword.ClientProxy", serverSide = "com.allforfunmc.FireSword.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler()
    public void load(FMLInitializationEvent event) {
	proxy.registerRenderers();
    }

    @EventHandler()
    public void postInit(FMLInitializationEvent event) {
	Code.Blocks();
	Code.Crafting();
	Code.Enchantments();
	Code.Smelting();
	Code.Items();
    }
}