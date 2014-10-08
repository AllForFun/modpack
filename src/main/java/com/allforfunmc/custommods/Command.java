package com.allforfunmc.custommods;

import java.util.ArrayList;

public class Command {
	String runableName = "";
	String humanName = "";
	public String help = "The author has not provided any help for this command";
	public Command(String RunableName, String HumanName){
		runableName = RunableName;
		humanName = HumanName;
		Commands.addCommand(this);
	}
	public static void Run(ArrayList<String> args){}
}
