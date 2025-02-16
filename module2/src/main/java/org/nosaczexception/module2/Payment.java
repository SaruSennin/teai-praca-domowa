package org.nosaczexception.module2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "payment")
public class Payment {

    private Map<String, Integer> markdowns;
    private Map<String, Integer> taxes;
    private String test;

    @EventListener(ApplicationReadyEvent.class)
    public void getPropertiesValues() {
        System.out.println(markdowns);
        System.out.println(taxes);
        System.out.println(test);
    }
}