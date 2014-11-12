package com.allforfunmc.allforfuncore;

import java.util.ArrayList;
import java.util.HashMap;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class Config {
	public Configuration config = null;
	public Config(FMLPreInitializationEvent event){
		config = new Configuration(event.getSuggestedConfigurationFile());
	}
	
	public DebugMode debugLevel;
	
	
	public void load(){
        //Properties
		config.load();
        Property debugLevelProperty = config.get("Debug", "DebugLevel", "none");
        debugLevelProperty.comment = "Please enter a debug type. The choices are: all, light, warn, error, or none";
        
        Property lavaGen = config.get("Options", "LavaGeneration", false);
        lavaGen.comment = "Would you like lava to generate under grass in the overworld?";
        config.save();
	}
	public HashMap getProperties(){
		HashMap properties = new HashMap();
		ArrayList<String> keys = new ArrayList<String>();
		config.load();
		properties.put("LavaGeneration",(boolean) config.get("Options", "LavaGeneration", false).getBoolean());
		properties.put("Debug",DebugMode.getByName(config.get("Debug", "DebugLevel", "none").getString()));
		config.save();
		System.out.println("AllForFun's Config found: "
				+ "DebugMode: " + properties.get("Debug")
				+ " | LavaGen: " + properties.get("LavaGeneration"));
		
		return properties;
	}
	
}
