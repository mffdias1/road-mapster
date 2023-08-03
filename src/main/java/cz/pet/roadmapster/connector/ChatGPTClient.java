package cz.pet.roadmapster.connector;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ChatGPTClient {

    @Value("${openai.api.url}")
    private String apiUrl;

    @Value("${openai.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public ChatGPTClient() {
        this.restTemplate = new RestTemplate();
    }

    public String getChatGPTResponse(String prompt) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setBearerAuth(apiKey);

            String postData = "{\"prompt\": \"" + prompt + "\", \"max_tokens\": 150}";
            HttpEntity<String> request = new HttpEntity<>(postData, headers);

            ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.POST, request, String.class);

            return parseChatGPTResponse(response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while getting the response from ChatGPT.";
        }
    }

    public String parseChatGPTResponse(String jsonResponse) {
        // Implement JSON parsing to extract the response from the API response
        // The JSON structure may have changed, so ensure you adapt this part accordingly
        // For example, you might use a JSON library like Jackson or Gson to handle JSON parsing.
        return jsonResponse;
    }
}
