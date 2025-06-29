package com.app.chatapi.api.message;


import jakarta.validation.constraints.NotNull;

public class MessageCreatedCommand {
    @NotNull
    private String text;
    @NotNull
    private String userId;
    @NotNull
    private String chatName;

    public MessageCreatedCommand(String text, String userId, String chatName) {
        this.text = text;
        this.userId = userId;
        this.chatName = chatName;
    }

    public String getText() {
        return text;
    }

    public String getUserId() {
        return userId;
    }
    public String getchatName() {
        return chatName;
    }
}
