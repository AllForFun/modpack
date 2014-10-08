package com.allforfunmc.custommods;

import java.util.ArrayList;

public class Mods {
	public static ArrayList<CustomMod> Mods = new ArrayList<CustomMod>();
	
	/**
	 * @author penne12
	 */
	public static void addMod(CustomMod mod){
		Mods.add(mod);
	}
	public static void runMods(){
		for (CustomMod mod : Mods){
			mod.run();
		}
	}
}
