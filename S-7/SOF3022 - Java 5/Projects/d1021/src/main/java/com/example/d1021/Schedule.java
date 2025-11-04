package com.example.d1021;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class Schedule {
    @Scheduled(fixedRate = 1000)
    public void getCurrentTime() {
        System.out.println(Instant.now().toString());
    }
}
