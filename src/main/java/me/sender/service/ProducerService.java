package me.sender.service;

import lombok.AllArgsConstructor;
import me.sender.domain.AbstractMessage;
import me.sender.infra.config.AppConstants;
import me.sender.repository.AbstractMessageRepository;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProducerService {
    private KafkaTemplate<String, AbstractMessage> kafkaTemplate;
    private final AbstractMessageRepository abstractMessageRepository;

    public void send(AbstractMessage abstractMessage) {
        kafkaTemplate.send(AppConstants.TOPIC, abstractMessage);
    }
}
