package me.sender.controller;

import lombok.AllArgsConstructor;
import me.sender.repository.AbstractMessageRepository;
import me.sender.service.ProducerService;
import me.sender.domain.AbstractMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
@AllArgsConstructor
public class ProducerController {
    private ProducerService producerService;
    private AbstractMessageRepository abstractMessageRepository;

    @PostMapping(value = "/producer")
    public ResponseEntity sendMessage(@RequestBody AbstractMessage abstractMessage)  {
        abstractMessageRepository.save(abstractMessage);
        producerService.send(abstractMessage);
        return ResponseEntity.ok().build();
    }
}
