package com.app.chatapi.api.message;

import com.app.chatapi.application.MessageManager;
import com.app.chatapi.domain.message.Message;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:5173", "http://localhost:3000"}, maxAge = 3600)
@RestController
@RequestMapping("/messages")
public class MessageController {
    private final MessageManager messageManager;

    @Autowired
    public MessageController(
            MessageManager messageManager) {
        this.messageManager = messageManager;
    }

    @GetMapping("/chat")
    public List<Message> getMessages(@RequestParam String chatName) throws Exception {
        return messageManager.getAllMessages(chatName);
    }

    @PostMapping("/new")
    public void addNewMessage(
            @Valid @RequestBody MessageCreatedCommand command
    ) {
        try {
            Message message = messageManager.save(command.getUserId(), command.getText(), command.getchatName());
            messageManager.send(message);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
