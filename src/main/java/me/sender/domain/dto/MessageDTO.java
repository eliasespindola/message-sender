package me.sender.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.sender.domain.Body;

@Getter
public class MessageDTO {
    private final Body body;

    public MessageDTO(Body body) {
        this.body = body;
    }
}
