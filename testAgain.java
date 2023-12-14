import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.util.*;

public class testAgain {{
	try {
		BufferedReader rd = new BufferedReader(new FileReader("Problem54.java"));
		while(true){
			String line = rd.readLine();
			if(line == null){
				break;
			}
		}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}}