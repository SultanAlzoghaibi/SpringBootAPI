package com.springbootapi.springbootapi;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public final class AIService {


    private ChatClient chatClient;
    public AIService(ChatClient.Builder builder) {
        chatClient = builder.build();
    }

    public String sendMessage(String prompt) {
        return chatClient.prompt(prompt)
                .call().content();
    }
}
