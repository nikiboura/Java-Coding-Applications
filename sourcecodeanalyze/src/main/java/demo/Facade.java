package demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import codeanalyzer.*;

public class Facade {

	public void Operation(filepath,sourceCodeAnalyzerType,sourceFileLocation,outputFilePath,outputFileType) {
	
		SourceCodeAnalyzer analyzer = new SourceCodeAnalyzer(sourceFileLocation);
		int loc = analyzer.calculateLOC(filepath, sourceCodeAnalyzerType);
		int nom = analyzer.calculateNOM(filepath, sourceCodeAnalyzerType);
		int noc = analyzer.calculateNOC(filepath, sourceCodeAnalyzerType);
		
		Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc",loc);
		metrics.put("nom",nom);
		metrics.put("noc",noc);
				
		MetricsExporter exporter = new MetricsExporter();
		exporter.writeFile(outputFileType, metrics, outputFilePath);
	}

}
