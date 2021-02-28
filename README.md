# mortgageapplication
Based on a code test this application execuctes according to the following brief:
The new customer centric bank Money Bin Inc. in Duckburg would like to have new product on the market. For that they need your help! 
There is a demand from their customers that they want to be able to borrow money and get to know the exact amount they have to pay each month over a
period of time.

The CEO of the bank has given the requirement like this:

"Given a total loan of X € and a fixed yearly interest rate of Y %. The customer wants to pay the same amount each month for Z
years. How much should the customer pay each month to pay off the whole debt?"

This is a java-program that uses Maven as a build tool and therefore it requires an installation of that before you can build and run the program. 
To try out the build, issue the following at the command line:

mvn compile

This will run Maven, telling it to execute the compile goal. When it’s finished, you should find the compiled .class files in the target/classes directory.

Package the file to a jar for running with the following at the command line:

mvn package

The package goal will compile your Java code, run any tests, and finish by packaging the code up in a JAR file within the target directory. 
The name of the JAR file will be based on the project’s <artifactId> and <version>. 
For example, given the minimal pom.xml file from before, the JAR file will be named mortgageplan-0.0.01-SNAPSHOT.jar.

To execute the JAR file run:

java -jar target/mortgageplan-0.0.1-SNAPSHOT.jar
