package com.allforfunmc.FrozenMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import com.allforfunmc.allforfuncore.Core;
import com.allforfunmc.allforfuncore.Crafting;
import com.allforfunmc.allforfuncore.TemplateAxe;
import com.allforfunmc.custommods.commands.TemplateBlock;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.util.EnumHelper;

@Mod (modid="frozenmod", name="AllForFun's Frozen Mod (not based on Frozen)", version="1")
public class Main{
	
	@Instance (value="GenericModID")
	public static Main instance;
	@SidedProxy(clientSide="com.allforfunmc.FrozenMod.ClientProxy",serverSide="com.allforfunmc.FrozenMod.CommonProxy")
	public static CommonProxy proxy;
	@EventHandler()
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
	public static ToolMaterial iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 30);
	//Blocks
	public static Block IceOre = new TemplateBlock(Material.ice,"sleshymod:ice_ore").setBlockName("ice_ore").setHardness(6f);
	public static Block IceBlock = new IceBlock(Material.ice);
	//Items
	public static Item IceSword = (new IceSword(iceMaterial));
	public static Item IceAxe = (new TemplateAxe(iceMaterial)).setUnlocalizedName("ice_axe").setTextureName("sleshymod:ice_axe");
	public static Item IcePick = new IcePick(iceMaterial);
	public static Item IceCrystal = (new Item()).setUnlocalizedName("ice_crystal").setCreativeTab(Core.AllForFunItems).setTextureName("sleshymod:ice_crystal");
	@EventHandler()
	public void postInit(FMLInitializationEvent event){
		ItemStack IcePickStack = new ItemStack(IcePick);
		IcePickStack.addEnchantment(Enchantment.silkTouch, 1);
		Crafting.smartRegisterTool("Axe", IceCrystal, IceAxe);
		MassR
	}
}