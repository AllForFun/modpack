package com.allforfunmc.FakeTnt;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "FakeTNT";
    public static final String VERSION = "1.0";
    
    //Blocks
    public Block FakeTNT = new FakeTNT();
    
    //Tool Material
    public ToolMaterial AwesomeMat = EnumHelper.addToolMaterial("awesome_material", 5, 99999, 5000F, 1000F, 1);
    
    //Items
    public Item AwesomeSword = new AwesomeSword(AwesomeMat);
    public Item AwesomePearl = new AwesomePearl();
    
    @EventHandler
    public void init(FMLInitializationEvent event){ 
    	
    	//Crafting
		GameRegistry.addShapelessRecipe(getBlazeTNT(), new ItemStack(Items.blaze_powder));
		GameRegistry.addShapedRecipe(new ItemStack(AwesomeSword), new Object[]{
			"ada",
			"ada",
			" s ",
			'a', AwesomePearl, 'd', Items.diamond,'s', Items.stick
		});
		
		//Blocks
		GameRegistry.registerBlock(FakeTNT, "fake_tnt");
		
		//Items
		GameRegistry.registerItem(AwesomeSword, "awesome_sword");
		GameRegistry.registerItem(AwesomePearl, "awesome_pearl");
    }
    public static ItemStack getBlazeTNT(){
    	ItemStack blazeTNT = new ItemStack(Blocks.tnt);
    	blazeTNT.setStackDisplayName("Blaze TNT");
    	blazeTNT.addEnchantment(Enchantment.fireAspect, 3);
    	return blazeTNT;
    }
    
}
