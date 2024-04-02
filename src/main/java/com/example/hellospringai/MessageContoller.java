package com.example.hellospringai;

import org.springframework.ai.chat.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageContoller {

    private final ChatClient chatClient;

    public MessageContoller(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/message")
    public String call(@RequestParam(value = "message", defaultValue = "Diga uma piada") String message){
        return chatClient.call(message);
    }
}
