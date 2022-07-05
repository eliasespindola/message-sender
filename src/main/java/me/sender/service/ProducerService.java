package me.sender.service;

import me.sender.infra.config.AppConstants;
import me.sender.domain.AbstractMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    @Autowired
    private KafkaTemplate<String, AbstractMessage> kafkaTemplate;

    public void send(AbstractMessage abstractMessage) {
        kafkaTemplate.send(AppConstants.TOPIC, abstractMessage);
    }
}
