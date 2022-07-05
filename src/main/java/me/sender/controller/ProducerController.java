package me.sender.controller;

import me.sender.service.ProducerService;
import me.sender.domain.AbstractMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class ProducerController {
    @Autowired
    ProducerService kafkaProducer;


    @PostMapping(value = "/producer")
    public String sendMessage(@RequestBody AbstractMessage abstractMessage)  {
        kafkaProducer.send(abstractMessage);
        return "foi";
    }
}
