package com.app.chatapi.domain.bus;

import com.app.chatapi.domain.message.Message;

public interface ChatMessageBus {
    void emit(Message message);
}
