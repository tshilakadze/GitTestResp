import acm.program.ConsoleProgram;

import java.io.FileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Problem52 extends ConsoleProgram {
	public void run() {
		try {
			BufferedReader rd = new BufferedReader(new FileReader("Problem52.java"));
			while(true){
				String line = rd.readLine();
				if(line == null){
					break;
				}
				println(line);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
