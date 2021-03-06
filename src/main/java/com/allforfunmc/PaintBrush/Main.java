package com.allforfunmc.PaintBrush;

import com.allforfunmc.creeperore.Code;
import com.allforfunmc.creeperore.CommonProxy;
import com.allforfunmc.creeperore.CreeperOreMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

@Mod (modid="PaintingMod", name="AllForFun's Painting Mod", version="1")
public class Main {
	@Instance (value="GenericModID")
	public static PaintingMod instance;
	
	public static Item PaintBrush = new Paintbrush();
	
	public class PaintingMod {
		
		@EventHandler()
		public void load(FMLInitializationEvent event) {
			GameRegistry.registerItem(PaintBrush, "paint_brush");
		}
		@EventHandler()
		public void postInit(FMLInitializationEvent event){
			
		}
	}
}
