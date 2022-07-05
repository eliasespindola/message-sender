package me.sender.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Properties {
    private String host;
    private Map<String,String> headers;
    private String topic;
}
