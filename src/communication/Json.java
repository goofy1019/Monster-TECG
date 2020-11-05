package communication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Json {
	private static ObjectMapper objectMapper = getDefaultObjectMapper();
	
	private static ObjectMapper getDefaultObjectMapper() {
		ObjectMapper defaultObjectMapper = new ObjectMapper();
		return defaultObjectMapper;
	}
	public static JsonNode parseJsonToJN(String JsonFileAddress) throws IOException {
		String jsonString;
		
		//read the file
		
		BufferedReader br = new BufferedReader( new FileReader(JsonFileAddress));
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
		 return parse(jsonString);
	}
	
	public static JsonNode parse(String JsonSource) throws JsonMappingException, JsonProcessingException {
	
		return objectMapper.readTree(JsonSource);
	}
	
	public static <A> A classFromJsonNode(JsonNode node, Class<A> clase) throws JsonProcessingException {
		return objectMapper.treeToValue(node, clase);
	}
	
	public static JsonNode classToJsonNode(Object o) {
		return objectMapper.valueToTree(o);
	}

}
