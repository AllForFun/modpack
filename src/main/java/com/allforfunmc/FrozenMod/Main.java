package com.allforfunmc.FrozenMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

import com.allforfunmc.allforfuncore.Core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.util.EnumHelper;

@Mod (modid="frozenmod", name="AllForFun's Frozen Mod (not based on Frozen)", version="1")
public class Main {

	public String modid = "refineddiamondmod";
	
	@Instance (value="GenericModID")
	public static Main instance;
	@SidedProxy(clientSide="com.allforfunmc.FrozenMod.ClientProxy",serverSide="com.allforfunmc.FrozenMod.CommonProxy")
	public static CommonProxy proxy;
	@EventHandler()
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
	public static ToolMaterial iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 30);
	public static Item IceSword = (new ItemSword(iceMaterial)).setMaxStackSize(1).setUnlocalizedName("ice_sword").setCreativeTab(Core.AllForFunTools).setTextureName("sleshymod:ice_sword");
	
	
	@EventHandler()
	public void postInit(FMLInitializationEvent event){
		
	}
}