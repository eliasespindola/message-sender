package me.sender.repository;

import me.sender.domain.AbstractMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AbstractMessageRepository extends MongoRepository<AbstractMessage,Long> {
}
