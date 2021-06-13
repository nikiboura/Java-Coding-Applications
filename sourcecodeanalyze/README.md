
## <a name="design patterns-lab-assignment"></a>Design Patterns Lab Assignment

**Java project using Design patterns**

The purpose of this project is to get familiar with the Design Patterns


**How to run the executable**

Use the command:

	java –jar “jar-with-dependencies” arg0 arg1 arg2 arg3 arg4
	
	were args translate to: 	
	arg0 = “JavaSourceCodeInputFile” (e.g., src/test/resources/TestClass.java)
	arg1 = “sourceCodeAnalyzerType” [regex|strcomp]
	arg2 = “SourceCodeLocationType” [local|web]
	arg3 = “OutputFilePath” (e.g., ../output_metrics_file)
	arg4 = “OutputFileType” [csv|json]
	
example: 
	java –jar ./target/sourcecodeanalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./src/test/resources/TestClass.java regex local metrics_results csv

**Dessign patterns used in this project**

-Facade Pattern

**Why select the Facade Pattern?**

The Facade Pattern was used in order to provide the client a more simple access to the components that communicated.
 
**How it affected the system?**

*Benefits

1. Simplyfies the interface of the system as it uses the facade class as an entry point to the classes that the client communicates

2. It de-couples the client as it reduces its funcionallity 

*Trade offs

1. The client is still coupled

**Errors made in the project**

1. Only the facade pattern is used 

2. There is a build error in the facade class

3. The test cases weren't modified




