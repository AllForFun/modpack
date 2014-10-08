package com.allforfunmc.custommods;

import java.util.ArrayList;
import java.util.HashMap;

public class Commands {
	public static ArrayList<Command> Commands = new ArrayList<Command>();
	public static HashMap CommandsMap = new HashMap();
	/**
	 * @author penne12
	 */
	public static void addCommand(Command Command){
		Commands.add(Command);
		CommandsMap.put(Command.runableName, Command);
	}
	public static Command getCommand(String runableName){
		return (Command) CommandsMap.get(runableName);
	}
	public static void run(commandLine codeLine){
		Command command = getCommand(codeLine.command);
		command.Run(codeLine.args);
	}
}
