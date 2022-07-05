package me.sender.controller;

import lombok.AllArgsConstructor;
import me.sender.service.ProducerService;
import me.sender.domain.Message;
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
    @PostMapping(value = "/producer")
    public ResponseEntity sendMessage(@RequestBody Message message)  {
        producerService.send(message);
        return ResponseEntity.ok().build();
    }
}
