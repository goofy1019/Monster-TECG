package communication;

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

	public static JsonNode parse(String JsonSource) throws JsonMappingException, JsonProcessingException {
		return objectMapper.readTree(JsonSource);
	}

}
