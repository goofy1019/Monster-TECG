package communication;

import java.io.BufferedReader;
import java.io.FileReader;

import com.fasterxml.jackson.databind.JsonNode;

public class JsonTest {
	public static void main(String args[]) {
		try {
			String jsonString;
			
			//read the file
			
			BufferedReader br = new BufferedReader( new FileReader("glossary.json"));
			 try {
				 StringBuilder sb = new StringBuilder();
				 String line = br.readLine();
				 while (line!=null) {
					 sb.append(line);
					 sb.append(System.lineSeparator());
					 line = br.readLine();
				 }
				 jsonString = sb.toString();
						 
			 } finally{ 
				 br.close();
			 }	 
			 
			 //Parse Json Node
			 JsonNode node = Json.parse(jsonString);
			 System.out.println(node.get("glossary").get("title").asText());
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
