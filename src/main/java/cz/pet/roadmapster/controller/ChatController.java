package cz.pet.roadmapster.controller;

import cz.pet.roadmapster.connector.ChatGPTClient;
import io.swagger.client.api.OpenAiApi;
import io.swagger.client.model.CreateChatCompletionRequest;
import io.swagger.client.model.CreateChatCompletionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatGPTClient chatGPTClient;
    private final OpenAiApi api = new OpenAiApi();

    @Autowired
    public ChatController(ChatGPTClient chatGPTClient) {
        this.chatGPTClient = chatGPTClient;
    }

    @PostMapping("/message")
    public String getChatGPTMessage(@RequestBody String prompt) {
        return chatGPTClient.getChatGPTResponse(prompt);
    }

}
