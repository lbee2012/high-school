package com.example.sof3022de5;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class Scheduling {
    @Scheduled(fixedRate = 1000)
    public void getCurrentTime() {
        System.out.println(Instant.now().toString());
    }
}
