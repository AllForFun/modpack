package com.allforfunmc.custommods;

import java.util.ArrayList;

public class commandLine {
	public static String command;
	public static ArrayList<String> args = new ArrayList<String>();	
	
	public commandLine(){
	}
	public commandLine(String line){
		String temp = " ";
		for (int i = 0; i == line.length(); i++){
				if (this.command != null){
					this.command = temp;
				} else {
					this.args.add(temp);
				}
				if (line.charAt(i) == ' '){
				temp = "";
			} else{
				temp = temp + line.charAt(i);
			}	
		}
	}
}
