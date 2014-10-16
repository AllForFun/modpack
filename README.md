AllForFun's Modpack
=============

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
  
8. Code away!


Waffle:
------
If you are a contributor, then use waffle. It looks better then GitHub Issues. 
https://waffle.io/allforfun/modpack


Contributing:
-------------
All contrubutions are licensed under an MIT licence. If you don't like it, don't code for us.

1. We want **good** stuff. Good ideas are always welcome, and there are tons of ideas in the waffle page.
2. Make sure you show what you are working on in the issues **before** you start.
3. Commit often while you are building - if you make a mistake, rolling back is possable.
4. Refrence your issue with #(Issue Number) in the title to link the commits and issues.
5. Close the issue **from a commit** (close/fix/fixes/closes #IssueNumber).

Building:
--------
If you must, temporally swap the build.gradle file for a new one.
Building is not recomended, and is subject to our Creative Commons lisence (see code)
