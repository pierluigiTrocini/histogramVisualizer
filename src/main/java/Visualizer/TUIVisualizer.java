package Visualizer;

import java.util.ArrayList;

import org.apache.commons.lang.StringUtils;

import histogramUtility.Pair;

public class TUIVisualizer extends VisualizerFactory{

	@Override
	public void showData( ArrayList<Pair> data ) {
		for( Pair pair: data ) {
			
			System.out.println( pair.getFirst() + "\t" + StringUtils.repeat("*", pair.getSecond()) );
			
		}
				
	}
	
}
