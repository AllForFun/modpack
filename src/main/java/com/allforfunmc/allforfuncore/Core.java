package com.allforfunmc.allforfuncore;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "AllForFunModpack", name = "AllForFun's Modpack Core", version = "1")
public class Core {
	public static DebugMode debugMode = DebugMode.None;
	
	private static void setDebugMode(DebugMode i){
		debugMode = i;
	}
    @Instance(value = "GenericModID")
    public static Core instance;
    @SidedProxy(clientSide = "com.allforfunmc.allforfuncore.ClientProxy", serverSide = "com.allforfunmc.allforfuncore.CommonProxy")
    public static CommonProxy proxy;
    public static Config Config = null;
    @EventHandler()
    public void preInit(FMLPreInitializationEvent event) {
            Config = new Config(event);
            Config.load();
            this.setDebugMode((DebugMode)Config.getProperties().get("Debug"));
    }
    @EventHandler()
    public void load(FMLInitializationEvent event) {
	proxy.registerRenderers();
    }

    @EventHandler()
    public void postInit(FMLInitializationEvent event) {

    }

    // Below is custom code for the mod -- used in all of AllForFun's Mods.
    public static final CreativeTabs AllForFunItems = new CreativeTabs(CreativeTabs.getNextID(), "funItems") {
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
	    return com.allforfunmc.refineddiamond.Code.refinedDiamond;
	}
    };
    public static final CreativeTabs AllForFunFood = new CreativeTabs(CreativeTabs.getNextID(), "funFood") {
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
	    return com.allforfunmc.chocolatestuff.Code.chocolateBar;
	}
    };
    public static final CreativeTabs AllForFunArmor = new CreativeTabs(CreativeTabs.getNextID(), "funArmor") {
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
	    return com.allforfunmc.moreoresandmore.Main.armorCobbleChest;
	}
    };
    public static final CreativeTabs AllForFunBlocks = new CreativeTabs(CreativeTabs.getNextID(), "funBlocks") {
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
	    return Item.getItemFromBlock(com.allforfunmc.refineddiamond.Code.Refined_Diamond_Block);
	}
    };
    public static final CreativeTabs AllForFunTools = new CreativeTabs(CreativeTabs.getNextID(), "funTools") {
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
	    return com.allforfunmc.refineddiamond.Code.MeltingPick;
	}
    };

    /**
     * Get drops of an ore
     * 
     * @param Item
     *            to drop
     * @param Fortune
     *            of pickaxe (6th param of getDrops)
     * @return List of items to drop.
     */
    public static final ArrayList<ItemStack> getOreDrops(Item itemDropped, int fortune) {
	ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	drops.add(new ItemStack(itemDropped, 1));
	if (fortune >= 0 && Core.Random.nextBoolean()) {
	    drops.add(new ItemStack(itemDropped, 1));
	}
	if (fortune >= 2 && Random.nextBoolean()) {
	    drops.add(new ItemStack(itemDropped, 1));
	}
	if (fortune >= 3 && drops.size() < 3 && Random.nextBoolean()) {
	    drops.add(new ItemStack(itemDropped, 1));
	}
	return drops;
    }

    public static int NullID;
    public static Random Random = new Random();
}