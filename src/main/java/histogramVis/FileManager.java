package histogramVis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	private static FileManager instance = new FileManager();
	private FileManager() {}
	public static FileManager getInstance() { return instance; }
	
	public ArrayList<Pair> getData() {
		ArrayList<Pair> data = new ArrayList<Pair>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					getClass().getResource("/data.txt").getFile()
					));
			while(reader.ready()) {
				String[] string = reader.readLine().split(" ");
				data.add( new Pair(string[0], Integer.parseInt(string[1])) );
				
			}
			
		} catch (IOException e) {
			System.out.println("Impossibile trovare il file");
		}
		
		
		
		return data;
	}
	
}
