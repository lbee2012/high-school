package com.example.sof3022de4;

import com.example.sof3022de4.repository.XeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class Scheduling {
    @Autowired
    XeRepo xRepo;
    @Scheduled(fixedRate = 60000)
    public void getCurrentTime() {
        System.out.println(xRepo.findAll().size() + " ban ghi - " + Instant.now().toString());
    }
}
