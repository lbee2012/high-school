package com.example.sof3022deevent;

import com.example.sof3022deevent.repository.VeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class Scheduling {
    @Scheduled(fixedRate = 10000)
    public void alerting() {
        System.out.println(Instant.now().toString());
    }
}
