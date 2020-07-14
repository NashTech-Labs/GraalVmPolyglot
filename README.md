# GraalVmPolyglot
This repository contains the template for using Polyglot mechanism provided by GraalVm. To demonstrate such a behavior
we are going to create two sample Java Applications. In first application we will just see how can we communicate
between two different lang in the same Java app. We show this through Java and JS communication. In the second application
we move a bit further by showing how we can pass variables from source language to target language. Thus depicting the
true power of Polyglot features of GraalVm.

## Steps to install GraalVm
1. Go to the official GraalVm https://www.graalvm.org/getting-started/#install-graalvm
2. Download the jar as per your OS.
3. Extract the GraalVm to a folder and update $PATH and $JAVA_HOME of your .bashrc.
4. They would look like this after updation:
export JAVA_HOME=~/Documents/sampleProjects/graalvm-ce-java8-20.1.0
export PATH=$JAVA_HOME/bin:$PATH
5. save the file and in a new terminal verify that your changes have taken effect by doing a `echo $JAVA_HOME` command.
6. Once you are done with this you would need to setup an sdk in your IDE for GraalVm so that instead of openJdk 1.8 you can leverage the Graal Jdk
7. My IDE is IntelliJ, so to add a new sdk: go to the File->ProjectStructure->PlatformSettings->sdk->click on the `+` icon there to add a new sdk
8. After clicking the `+` icon browse to the location where you have extracted your graalVm binary and click apply->ok.
9. This will add GraalVm to the dependency list of your application.
10. Remember GraalVm comes with inbuilt support for Java and Js but for other languages like python, ruby, R you would need to execute the following commands in a new terminal:
  `gu install python`, `gu install ruby` etc.

## Steps to run the application

1. There are 2 java applications in this repository.
2. The application: **PolyglotJavaAndJs** is the app demonstrating a simple communication between Java and JS.
 To run it in a terminal go to the /src folder and run commands **javac PolyglotJavaAndJs.java and then java PolyglotJavaAndJs**.
3. The other Applications: **PolyglotJavaAndPython** shows how to pass variables between Source and Target languages.
4. To run this application go to the /src folder in a terminal and run command **javac PolyglotJavaAndPython.java and then java PolyglotJavaAndPython**.


## That is all about the working of this repository, suggestions and improvements are most welcome. :shipit:
