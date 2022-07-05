package me.sender.repository;

import me.sender.domain.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AbstractMessageRepository extends MongoRepository<Message,Long> {
}
