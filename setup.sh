cd ${PWD}
mkdir .temp
cd ./.temp
curl -L -o mcforge.zip http://files.minecraftforge.net/maven/net/minecraftforge/forge/1.7.10-10.13.1.1219/forge-1.7.10-10.13.1.1219-src.zip
unzip mcforge.zip -d ./mcforge
cd ..
mv ./.temp/mcforge/eclipse ./
mv build.gradle ./.temp/build.gradle
mv ./.temp/mcforge/build.gradle ./
./gradlew setupdecompworkspace —-refresh-dependencies
./gradlew eclipse
rm build.gradle
mv ./.temp/build.gradle build.gradle
rm -rf ./.temp