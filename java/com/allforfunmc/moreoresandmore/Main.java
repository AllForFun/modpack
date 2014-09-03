package com.allforfunmc.moreoresandmore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid =  Main.modid, version = Main.version)
public class Main {

	public static final String modid = "moreoresandmore";
	public static final String version = "1.0.0";
	
	public static Block blockCompressedCobble;
	
	public static String bootName = "Iron Boots"; 
	
	/* public boolean onTickInGame(float f, Minecraft minecraft) {
		if(minecraft.thePlayer.inventory.armorItemInSlot(0) != null) {
			ItemStack itemstack = minecraft.thePlayer.inventory.armorItemInSlot(0);
			if(itemstack.getDisplayName() == bootName); {
				//minecraft.thePlayer.speedOnGround = 0.4F;
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 200, 10));
			}
		}
	} */
	
	public Main(World world, EntityPlayer player, ItemStack itemStack) {

		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null) {
			ItemStack helmet = player.getCurrentArmor(3);
			ItemStack plate = player.getCurrentArmor(2);
			ItemStack legs = player.getCurrentArmor(1);
			ItemStack boots = player.getCurrentArmor(0);
			
		if (helmet.getItem() == Items.iron_helmet && plate.getItem() == Items.iron_chestplate && legs.getItem() == Items.iron_leggings && boots.getItem() == Items.iron_boots)
			{
			//player.fallDistance = 0.0F;
			player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 200, 10));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 200, 10));
			}
			}
		} 

	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
	

		
		//blocks
		blockCompressedCobble = new CompressedCobble(Material.rock).setBlockName("CompressedCobble").setHardness(5.0F).setResistance(2000.0F);
		GameRegistry.registerBlock(blockCompressedCobble, "CompressedCobble");
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent Event){
		
		//crafting
		GameRegistry.addShapedRecipe(new ItemStack(blockCompressedCobble, 1), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.cobblestone});
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
}
