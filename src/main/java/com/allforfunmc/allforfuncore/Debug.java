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
	
	public static Debug Print(Object message, DebugType type){
		return new Debug(message, type);
	}
	
	public static Debug Error(Exception error){
		return new Debug("Error! " + error.getMessage() +
				" because of " + error.getCause() +
				". At" + error.getStackTrace()
				,DebugType.Error);
	}
	
	public static Debug Print(Object message, int type){
		return new Debug(message, type);
	}
	
	public static Debug info(Object message){
		return new Debug(message, DebugType.Info);
	}
}
