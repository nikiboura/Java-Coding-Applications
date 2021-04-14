package gradeshistogram;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


/***
 * 
 * @author nikiboura
 * The purpose of this class is to demonstrate a simple
 * java project that reads a file with students’ grades, and generates its histogram
 * Parts of this class were taken from agkortzis project in his github repository.
 *  
 */
public class HistogramGenerator {
	
	public List<Integer> readFile(String filename) {
		
		List<Integer> data = new ArrayList<Integer>();
		try {
		      File myObj = new File(filename);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String num = myReader.nextLine();
		        data.add(Integer.parseInt(num));
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }	
		return data;	
	}

	/***
	 * Receives a List of type Integer. From this list the dataset
	 * that will be used for the visualization is generated. Finally, The chart
	 * is generated with the use of the aforementioned dataset and then
	 * presented in the screen.
	 * 
	 * @param dataValues List of type Integer
	 */
	public void generateChart(List<Integer> dataValues) {
		/*
		 * The XYSeriesCollection object is a set XYSeries series (dataset) that
		 * can be visualized in the same chart
		 */
		XYSeriesCollection dataset = new XYSeriesCollection();
		/*
		 * The XYSeries that are loaded in the dataset. There might be many
		 * series in one dataset.
		 */
		XYSeries data = new XYSeries("random values");
		
		//find the frequency of each grade
		int [] frequencies = new int [11];  
		for(int i = 0; i <= 10; i++){  
			int freq = Collections.frequency(dataValues, i);
			frequencies[i]= freq;
		}
		
	                
	    for (int j = 0; j < frequencies.length; j++) {
	    	 data.add(j, frequencies[j]);    			
	    }
	     
		// add the series to the dataset
		dataset.addSeries(data);

		boolean legend = false; // do not visualize a legend
		boolean tooltips = false; // do not visualize tooltips
		boolean urls = false; // do not visualize urls

		// Declare and initialize a createXYLineChart JFreeChart
		JFreeChart chart = ChartFactory.createXYLineChart("Chart title", "grades", "frequences", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);

		/*
		 * Initialize a frame for visualizing the chart and attach the
		 * previously created chart.
		 */
		ChartFrame frame = new ChartFrame("First", chart);
		frame.pack();
		// makes the previously created frame visible
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		/*
		 * Reads a file name from the command line
		 * and calls the method readFile to get the file's data
		 */
		
		//List that will store the data from the file
		List<Integer> dataValues = new ArrayList<Integer>();
	
        //Suppose file wasn't given in the runtime
//	    String filename = "grades.txt";
//		HistogramGenerator rf = new HistogramGenerator();
//		dataValues = rf.readFile(filename);
//		HistogramGenerator demo = new HistogramGenerator();
//		demo.generateChart(dataValues);
		
		 if (args.length > 0) {
		   String filename = args[0];
		   HistogramGenerator rf = new HistogramGenerator();
		   dataValues = rf.readFile(filename);	
		   HistogramGenerator demo = new HistogramGenerator();
		   demo.generateChart(dataValues);
		} else {
		   System.err.println("Invalid arguments");
		   System.exit(0);
		}
		
	}
}