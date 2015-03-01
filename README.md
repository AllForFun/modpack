#AllForFun's Modpack

###Please note:
The developers of this pack have lost their interest. If you'd like to continue this, raise an issue, and we'll talk with you! Thanks for everything. If you'd like to keep up with what  [penne12](http://twitter.com/penne12_) is doing, visit [his site](http://bensites.com)

##Mod List:


Names					| Desc
------------------|-----------
**Core**				| Classes that all mods use!
**Refined Diamond**	| Diamonds boring? Make new tools!
**Scaffolding**		| Blocks that can be instantly destroyed
**Creeper Ore**		| Tons of explosive things. Including portable nukes.
**Write Stone**		| Importing and Exporting redstone
**Bottle XP**			| Smelt out the inner xp from gold nuggets.
**Camo Stuff**		| Invisable armor and items. Great for pvp invisablity!
**ChocolateStuff** [^1]| Eat chocolate.
**Dark Glass**		| Glowstone glass, and opaque glass
**Earth Stuff**		| Stuff from the earth.
**Emerald Armor** [^1]| Armor made from emeralds
**Fake TNT**			| TNT that doesn't work. And an awesome sword!
**Launcher**			| SNOWBALL FIGHT!
**Get wood back**	| Crafting crafting crafting tables that craft crafting 						  tables into logs.
**Obsidian Tools**	| Makes what is says on the tin.
**AND MORE**			| There are way more mods waiting to be discovered.

Easy Cloning:
------------
####Mac & Linux
1. Open Terminal
2. Type 'cd', and drag in the folder you cloned the repo into. Then press enter.
3. Run this command, and follow the instuctions.

    curl -O https://gist.githubusercontent.com/penne12/c175b48f44426fa7190c/raw/a403a09b5b237b58f0c0f692d6885cc41c9950f1/setup.sh && chmod a+x ./setup.sh && ./setup.sh

####Windows

#####Easy Way:

1. Install Ubuntu
2. Follow the above instuctions for Linux

#####Hard Way:

1. Press the start button
2. Type 'cmd'. Then press enter
3. In the window that opens, type 'cd', and drag in the folder you cloned the repo into. Then press enter.
4. In the file you cloned, create an empty text file called apikey.txt.
5. Go back to the command propt you opened in step 2.
6. Type the following command: gradlew setupdecompworkspace --refresh-dependencies
7. If you want to use eclipse, type this command: gradlew eclipse
8. Download and install Groovy, at this link: http://dl.bintray.com/groovy/Distributions/groovy-2.3.7-installer.exe

  


Waffle:
------
If you are a contributor, then use waffle. It looks better then GitHub Issues. 
https://waffle.io/allforfun/modpack


Contributing:
-------------
All contrubutions are licensed under an MIT licence. If you don't like it, don't code for us.

- We want **good** stuff. Good ideas are always welcome, and there are 
- Make sure you show what you are working on in the issues **before** you start.
- Commit often while you are building - Use a differnt branch - if you make a mistake, rolling back is possable.
- Refrence your issue with #(Issue Number) in the title to link the commits and issues.
- Close the issue **from a commit** (close/fix/fixes/closes #IssueNumber).

Make sure you have an understanding of Git. [Try Git][tutorial] is a great tutorial to learn from, and you'll be able to commit and clone within 15 minutes.

[tutorial]:https://try.github.io/

Building [^2] :
--------
If you must, temporally swap the build.gradle file for a new one.





[^1]: Currently bugged.
[^2]: Not recommended.
