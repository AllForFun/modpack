package com.allforfunmc.scaffolding;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod (modid="scaffoldingMod", name="AllForFun's ScaffoldingMod", version="2")
public class scaffoldingmod {
	public static Block BlockOfScaffolding;
	public static Block BlockOfScaffoldingWithLight;
	@Instance (value="GenericModID")
	public static scaffoldingmod instance;
	@SidedProxy(clientSide="com.allforfunmc.scaffolding.ClientProxy",serverSide="com.allforfunmc.scaffolding.CommonProxy")
	public static CommonProxy proxy;
	@EventHandler()
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
	@EventHandler()
	public void postInit(FMLInitializationEvent event){
		BlockOfScaffolding = new BlockOfScaffolding(Material.rock);
		GameRegistry.registerBlock(BlockOfScaffolding, "BlockOfScaffolding");
		
		BlockOfScaffoldingWithLight = new BlockOfScaffoldingWithLight(Material.rock);
		GameRegistry.registerBlock(BlockOfScaffoldingWithLight, "BlockOfScaffoldingWithLight");
		
		GameRegistry.addRecipe(new ItemStack(BlockOfScaffolding, 16), new Object[]{
			"SSS",
			"SPS",
			"SSS",
			'S', Blocks.stone, 'P', Items.wooden_pickaxe
	});
		GameRegistry.addRecipe(new ItemStack(BlockOfScaffoldingWithLight, 8), new Object[]{
			"SSS",
			"SCS",
			"SSS",
			'S', BlockOfScaffolding, 'C', Items.coal
		});
}}