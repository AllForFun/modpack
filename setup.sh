cd ${PWD}

echo > apikey.txt
./gradlew setupdecompworkspace --refresh-dependencies;
read -p "Do you want to use Eclipse? " yn
    case $yn in
        [Yy]* ) ./gradlew eclipse;
        [Nn]* ) ;
        * );
    esac

