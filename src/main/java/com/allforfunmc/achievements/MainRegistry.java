package com.allforfunmc.achievements;



import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.AchievementPage;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "funachievements", name = "Achieve-ments by AllForFun", version = "1.0")
public class MainRegistry 
{
	
	@SidedProxy(clientSide = "ClientProxy.java", serverSide = "com.allforfunmc.achievements.ServerProxy")
	public static ServerProxy proxy;
   
    
    @Metadata
    public static ModMetadata meta;
    
    @Instance("GenericModID")
    public static MainRegistry modInstance;
    
    public static Achievement achievementdeath;
    public static Achievement achievementdeath5;
    
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent event)
    {   	
    	proxy.registerRenderThings();
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	achievementdeath = new Achievement("achievement.death", "achievementdeath", 0, 0, new ItemStack(Items.arrow), (Achievement)null).initIndependentStat().registerStat();
    	achievementdeath5 = new Achievement("achievement.death5", "achievementdeath5", 2, 1, new ItemStack(Items.skull), achievementdeath).registerStat();
    	
    	AchievementPage.registerAchievementPage(new AchievementPage("ElementalOres Achievements", new Achievement[]{achievementdeath, achievementdeath5}));
    
    	FMLCommonHandler.instance().bus().register(new OnDeathEvent());
    	FMLCommonHandler.instance().bus().register(new OnDeathFifthTimeEvent());
    }
    
    @EventHandler
    public void PostLoad(FMLPostInitializationEvent PostEvent)
    {
    	
    }
    
}
