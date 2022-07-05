package me.sender.service;

import lombok.AllArgsConstructor;
import me.sender.domain.Message;
import me.sender.domain.dto.MessageDTO;
import me.sender.infra.config.AppConstants;
import me.sender.repository.AbstractMessageRepository;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProducerService {
    private KafkaTemplate<String, MessageDTO> kafkaTemplate;
    private final AbstractMessageRepository abstractMessageRepository;

    public void send(Message message) {
        abstractMessageRepository.save(message);
        kafkaTemplate.send(AppConstants.TOPIC, new MessageDTO(message.getBody()));
    }
}
