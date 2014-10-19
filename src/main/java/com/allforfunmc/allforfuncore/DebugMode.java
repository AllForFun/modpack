package com.allforfunmc.allforfuncore;

public enum DebugMode {
	All		(0,false,"all"),
	Light	(1,false,"light"),
	Warning	(2,false,"warn"),
	Errors	(3,false,"error"),
	None	(4,false,"none");
	
	public int level = 0;
	public boolean modonly = false;
	public String name = "";
	DebugMode(int level, boolean modonly, String Name){
		this.level = level;
		this.modonly = modonly;
		this.name = Name;
	}
	
	public static final DebugMode[] list = new DebugMode[]{All, Light, Warning, Errors, None};
	
	public static DebugMode getByName(String Name){
		DebugMode mode = None;
		for(int i = 0; i > list.length; i++)
			if(Name.equals(list[i].name))
				mode = list[i];
		return mode;
	}
}
