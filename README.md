AllForFun's Modpack
=============
Mod List:
--------
Names					| Desc
:------------------:|:-----------
**Core**				| Classes that all mods use!
**Refined Diamond**	| Diamonds boring? Make new tools!
**Scaffolding**		| Blocks that can be instantly destroyed
**Creeper Ore**		| Tons of explosive things. Including portable nukes.
**Write Stone**		| Importing and Exporting redstone
**Bottle XP**			| Smelt out the inner xp from gold nuggets.
**Camo Stuff**		| Invisable armor and items. Great for pvp invisablity!
**ChocolateStuff**[^1]| Eat chocolate.
**Dark Glass**		| Glowstone glass, and opaque glass
**Earth Stuff**		| Stuff from the earth.
**Emerald Armor**[^1]| Armor made from emeralds
**Fake TNT**			| TNT that doesn't work. And an awesome sword!
**Launcher**			| SNOWBALL FIGHT!
**Get wood back**	| Crafting crafting crafting tables that craft crafting 						  tables into logs.
**Obsidian Tools**	| Makes what is says on the tin.
**AND MORE**			| There are way more mods waiting to be discovered.

Cloning:
------------
Cloning is pretty simple, just follow the instuctions, or on mac, a script to do this automaticly is coming.

1. Download the lastest MinecraftForge src version.
2. Clone the repository.
3. Temperaly move the existing build.gradle file somewhere else.
4. Move the build.gradle file from the MinecraftForge folder you downloaded into the repository.
5. Move the eclipse folder into the repository.
6. CD in to the repository in your command promt.
7. Run the command based on your operating system:

  **Unix/Bash**
  
  	./gradlew setupdecompworkspace --refresh-dependencies; ./gradlew eclipse
  	
  **Windows**
  
  Do both commands one after anouther:
  
  	gradlew setupdecompworkspace --refresh-dependencies
  	
  	gradlew eclipse
  
8. **Code away!**


Waffle:
------
If you are a contributor, then use waffle. It looks better then GitHub Issues. 
https://waffle.io/allforfun/modpack


Contributing:
-------------
All contrubutions are licensed under an MIT licence. If you don't like it, don't code for us.

- We want **good** stuff. Good ideas are always welcome, and there are 
- Make sure you show what you are working on in the issues **before** you start.
- Commit often while you are building - if you make a mistake, rolling back is possable.
- Refrence your issue with #(Issue Number) in the title to link the commits and issues.
- Close the issue **from a commit** (close/fix/fixes/closes #IssueNumber).

Building [^2] :
--------
If you must, temporally swap the build.gradle file for a new one.





[^1]: Currently bugged.
[^2]: Not recommended.
