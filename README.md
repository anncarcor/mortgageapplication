# mortgageapplication
To try out the build, issue the following at the command line:

mvn compile
This will run Maven, telling it to execute the compile goal. When it’s finished, you should find the compiled .class files in the target/classes directory.

Package the file to a jar for running with the following at the command line:

mvn package
The package goal will compile your Java code, run any tests, and finish by packaging the code up in a JAR file within the target directory. 
The name of the JAR file will be based on the project’s <artifactId> and <version>. 
For example, given the minimal pom.xml file from before, the JAR file will be named mortgageplan-0.0.01-SNAPSHOT.jar.

To execute the JAR file run:

java -jar target/mortgageplan-0.0.01-SNAPSHOT.jar
