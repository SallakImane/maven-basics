
# Maven Basics

Example project of how to use maven to deploy jar file.

#### File structure :

    + `jar` file contains : 

        > `META-INF/`       : this directory contains MANIFEST.MF
        > `*.class / *.jar` : All compiled classes and 3rt paty libraries

# Getting Started 

1. Generate a new project from an archetype with this command:

		mvn archetype:generate -DgroupId=com.imane -DartifactId=project-2 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

2. Add in file pom.xml the plugins like :

  + `maven-compiler-plugin` : set compiler support java 11 .

  + `maven-assembly-plugin` : is used to create archives of project sources, classes, dependencies (get all dependencies and mainClass in manifest) from flexible assembly descriptors.

3. Take the compiled code and package it in its distributable format, such as a JAR  with this command : 

		mvn clean package

4. Execute with command : 

		java -jar target/project-2-1.0-SNAPSHOT-jar-with-dependencies.jar 

# Authors
 + [**Sallak Imane**](https://github.com/SallakImane) 
