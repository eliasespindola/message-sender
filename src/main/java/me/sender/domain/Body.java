package me.sender.domain;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Body {
    private String event;
    private JsonNode source;
}
