package com.allforfunmc.obsidiantools;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = "obsidiantools", name = "AllForFun's Obsidian Tools", version = "Alpha")
public class ObsidianTools {
    @Instance(value = "GenericModID")
    public static ObsidianTools instance;
    @SidedProxy(clientSide = "com.allforfunmc.obsidiantools.ClientProxy", serverSide = "com.allforfunmc.obsidiantools.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler()
    public void load(FMLInitializationEvent event) {
	proxy.registerRenderers();
    }

    @EventHandler()
    public void postInit(FMLInitializationEvent event) {
	Code.Blocks();
	Code.Items();
	Code.Crafting();
	Code.Enchantments();
	Code.Smelting();
    }
}