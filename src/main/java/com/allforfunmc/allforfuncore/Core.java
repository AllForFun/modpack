package com.allforfunmc.allforfuncore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;

@Mod (modid="Core", name="AllForFun's Modpack Core", version="1")
public class Core {
	@Instance (value="GenericModID")
	public static Core instance;
	@SidedProxy(clientSide="com.allforfunmc.allforfuncore.ClientProxy",serverSide="com.allforfunmc.allforfuncore.CommonProxy")
	public static CommonProxy proxy;
	@EventHandler()
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
	@EventHandler()
	public void postInit(FMLInitializationEvent event){
		
	}
	
	
	//Below is custom code for the mod -- used in all of AllForFun's Mods.
	public static final CreativeTabs AllForFunItems = new CreativeTabs(CreativeTabs.getNextID(), "AllForFun's Items") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return com.allforfunmc.refineddiamond.Code.refinedDiamond;
	    }
	};
	public static final CreativeTabs AllForFunFood = new CreativeTabs(CreativeTabs.getNextID(), "AllForFun's Food") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return com.allforfunmc.chocolatestuff.Code.chocolateBar;
	    }
	};
	public static final CreativeTabs AllForFunArmor = new CreativeTabs(CreativeTabs.getNextID(), "AllForFun's Armor") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return com.allforfunmc.moreoresandmore.Main.armorCobbleChest;
	    }
	};
	public static final CreativeTabs AllForFunBlocks = new CreativeTabs(CreativeTabs.getNextID(), "AllForFun's Blocks") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item.getItemFromBlock(com.allforfunmc.refineddiamond.Code.Refined_Diamond_Block);
	    }
	};
	public static final CreativeTabs AllForFunTools = new CreativeTabs(CreativeTabs.getNextID(), "AllForFun's Tools") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return com.allforfunmc.refineddiamond.Code.MeltingPick;
	    }
	};

	
	public static int NullID;
	public static Random Random = new Random();
}