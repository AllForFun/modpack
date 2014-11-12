package com.allforfunmc.allforfuncore;

public class Debug{
	
	private Debug(Object message, int level){
		if(level <= Core.debugMode.level)
			System.out.println(message);
	}
	
	private Debug(Object message, DebugType type){
		this(message, type.level);
	}
	
	private Debug(Exception error){
		this("Error! " + error.getMessage() +
				" because of " + error.getCause() +
				". At" + error.getStackTrace()
				,DebugType.Error);
	}
	
	public static void Print(Object message, DebugType type){
		new Debug(message, type);
	}
	
	public static void Error(Exception error){
		new Debug("Error! " + error.getMessage() +
				" because of " + error.getCause() +
				". At" + error.getStackTrace()
				,DebugType.Error);
	}
	
	public static void Print(Object message, int type){
		new Debug(message, type);
	}
	
	public static void info(Object message){
		new Debug(message, DebugType.Info);
	}
}
