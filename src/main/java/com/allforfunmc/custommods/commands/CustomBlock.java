package com.allforfunmc.custommods.commands;

import java.util.ArrayList;
import java.util.HashMap;

import com.allforfunmc.custommods.Command;

public class CustomBlock extends Command{
	public CustomBlock(){
		super("block","Block tools");
		this.help = "Create a new block"
				+ "Sytax: block (action) (type) (name) (texture) (materail)";
	}
	public static void Run(ArrayList<String> argsList){
		HashMap args = getArgsMap(argsList);
		if (args.get("action") == "new"){
			if (args.get("type") == "block"){
				
			}
		}
	}
	/**
	 * 
	 * @param Arguments in list (action type name texture material)
	 * @return HashMap with arguements 
	 */
	public static HashMap getArgsMap(ArrayList<String> args){
		HashMap argsMap = new HashMap();
		argsMap.put("action", args.get(0));
		argsMap.put("type", args.get(1));
		argsMap.put("name", args.get(2));
		argsMap.put("texture", args.get(3));
		argsMap.put("material", args.get(4));
		return argsMap;
	}
}
