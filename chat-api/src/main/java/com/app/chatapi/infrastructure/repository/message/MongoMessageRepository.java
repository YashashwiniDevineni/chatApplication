package com.app.chatapi.infrastructure.repository.message;

import com.app.chatapi.domain.message.Message;
import com.app.chatapi.domain.message.MessageRepository;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.domain.Sort.Direction.ASC;

@Repository
public class MongoMessageRepository implements MessageRepository {

    private DefaultMongoMessageRepository defaultMongMessageRepository;
    private MongoOperations mongoOperations;

    public MongoMessageRepository(
            DefaultMongoMessageRepository defaultMongMessageRepository,
            MongoOperations mongoOperations
    ) {
        this.defaultMongMessageRepository = defaultMongMessageRepository;
        this.mongoOperations = mongoOperations;
    }

    @Override
    public Message save(Message message) {
        return defaultMongMessageRepository.save(message);
    }

    @Override
    public List<Message> findByChatNameOrderByDate(String chatName) {
        Query query = new Query(Criteria.where("chatName").is(chatName));
        query.with(Sort.by(ASC, "date"));
        return mongoOperations.find(query, Message.class);
    }
}
