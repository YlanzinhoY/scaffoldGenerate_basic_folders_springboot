generateClass:
	javac Main.java GenerateFolder.java

genJar:
	jar cfe scaffoldGenerate.jar Main *.class
