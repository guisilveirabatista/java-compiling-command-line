Compiling:

In the folder: `src/main/java`, run the command:
`javac -classpath "C:\Users\guisi\Desktop\workspace\java\project1\lib\wordnet-random-name-1.5.jar;" nl/guisilver/Main.java`

Generating jar file:
In the folder: `src/main/java`, run the command:
`jar cvfm ../../../target/program.jar ../../../META-INF/manifest.txt nl`

Copy the lib folder to target folder, so it's visible by the jar:
In the root folder of the project, run:
`cp -r lib target`

Running the jar:
In the root folder of the project, run:

`java -jar target/program.jar`