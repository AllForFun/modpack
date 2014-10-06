cd ${PWD}
mkdir .temp
cd ./.temp
curl -o mcforge.zip http://files.minecraftforge.net/minecraftforge/minecraftforge-src-latest.zip
unzip file.zip -d ./mcforge
cd ..
mv ./.temp/mcforge/eclipse ./
mv build.gradle ./.temp/build.gradle
mv ./.temp/mcforge/build.gradle ./
./gradlew setupdecompworkspace —-refresh-dependencies
./gradlew eclipse
rm build.gradle
mv ./.temp/build.gradle build.gradle
rm -rf ./.temp