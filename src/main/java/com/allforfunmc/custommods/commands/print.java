package com.allforfunmc.custommods.commands;

import java.util.ArrayList;

import com.allforfunmc.custommods.Command;

public class print extends Command{
	public print(){
		super("print","Print to Console");
		this.help = "Prints argument to console";
	}
	public static void Run(ArrayList<String> args){
		System.out.println(args.get(0));
	}
}
