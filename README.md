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


Building:
--------
If you must, temporally swap the build.gradle file for a new one.
Building is not recomended, and is subject to our Creative Commons lisence (see code)
