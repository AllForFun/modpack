package com.allforfunmc.custommods;

import java.util.ArrayList;
/**
 * Custom Mod
 * @author penne12
 */
public class CustomMod {
	public static ArrayList<commandLine> commands = new ArrayList<commandLine>();
	public CustomMod(String[] codeLines){
		for (String code : codeLines){
			commands.add(new commandLine(code));
		}
		Mods.addMod(this);
	}
	public static void run(){
		for (commandLine command : commands){
			Commands.run(command);
		}
	}
}
