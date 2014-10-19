package com.allforfunmc.allforfuncore;

public enum DebugType {
	Info	(0),
	Light	(1),
	Warning	(2),
	Error	(3);
	public int level = 0;
	DebugType(int Level){
		this.level = Level;
	}
}
