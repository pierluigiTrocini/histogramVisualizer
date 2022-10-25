package main;

import Visualizer.SwingVisualizer;
import Visualizer.TUIVisualizer;
import histogramUtility.FileManager;

public class Main {

	public static void main(String[] args) {
		
		TUIVisualizer tuiVisualizer = new TUIVisualizer();
		tuiVisualizer.showData( FileManager.getInstance().getData() );
		
		SwingVisualizer swingVisualizer = new SwingVisualizer();
		swingVisualizer.showData( FileManager.getInstance().getData() );

	}

}
