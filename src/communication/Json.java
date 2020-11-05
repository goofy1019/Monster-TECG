package communication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author Abner Arroyo y Adolfo Amador
 *
 */
public class Json {
	private static ObjectMapper objectMapper = getDefaultObjectMapper();
	
	/**
	 * This method returns the default object mapper 
	 * 
	 * @return Object Mapper
	 */
	private static ObjectMapper getDefaultObjectMapper() {
		ObjectMapper defaultObjectMapper = new ObjectMapper();
		return defaultObjectMapper;
	}
	
	/**
	 * This method returns a JsonNode object parsed given a .json file in the parameter
	 * 
	 * @param JsonFileAddress
	 * @return A JsonNode 
	 * @throws IOException
	 */
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
	
	/**
	 * This method parses a JsonNode object from a String with the necessary formtat
	 * 
	 * @param JsonSource
	 * @return
	 * @throws JsonMappingException
	 * @throws JsonProcessingException
	 */
	public static JsonNode parse(String JsonSource) throws JsonMappingException, JsonProcessingException {
	
		return objectMapper.readTree(JsonSource);
	}
	
	/**
	 * This method "converts" an input JsonNode into a specified java class. The class will have the same attributes as the json object
	 * 
	 * @param <A>
	 * @param node
	 * @param clase
	 * @return
	 * @throws JsonProcessingException
	 */
	public static <A> A classFromJsonNode(JsonNode node, Class<A> clase) throws JsonProcessingException {
		return objectMapper.treeToValue(node, clase);
	}
	
	/**
	 * This method "converts" java class into a JsonNode object. THe JsonNode will have the same attributes as the class it was created from
	 * @param o
	 * @return
	 */
	public static JsonNode classToJsonNode(Object o) {
		return objectMapper.valueToTree(o);
	}

}
