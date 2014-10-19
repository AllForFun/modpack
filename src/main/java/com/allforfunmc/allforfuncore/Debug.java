package com.allforfunmc.allforfuncore;

public class Debug {
	public Debug(String message, int level){
		if(level >= Core.debugMode.level)
			System.out.println(message);
	}
	public Debug(String message, DebugType type){
		this(message, type.level);
	}
	public Debug(Exception error){
		this("Error! " + error.getMessage() +
				" because of " + error.getCause() +
				". At" + error.getStackTrace()
				,DebugType.Error);
	}
}
