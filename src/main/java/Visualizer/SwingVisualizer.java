package Visualizer;

import java.util.ArrayList;
import javax.swing.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import histogramUtility.Pair;

public class SwingVisualizer extends VisualizerFactory {
	
	private JFreeChart getChart ( ArrayList<Pair> data ) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		for( Pair pair: data ) 
			dataset.addValue(pair.getSecond(), pair.getFirst(), "followers");
		
		JFreeChart chart = ChartFactory.createBarChart("Followers su Ig (in milioni)", 
													   "Pilota", 
													   "Followers", 
													   dataset);
		return chart;		
	}
	
	@Override
	public void showData ( ArrayList<Pair> data ) {
		
		JFrame frame = new JFrame("Swing Visualizer");
		frame.setSize(400, 400);
		
		ChartPanel panel = new ChartPanel( getChart(data) );
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
