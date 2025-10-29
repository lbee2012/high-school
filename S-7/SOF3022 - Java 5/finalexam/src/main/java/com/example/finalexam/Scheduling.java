package com.example.finalexam;

import com.example.finalexam.repository.XeRepo;
import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.grammars.hql.HqlParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

@Component
public class Scheduling {
    @Autowired
    XeRepo xRepo;

    @Scheduled(fixedRate = 60000)
    public void howManyRecordsAreThereInTheDatabase() {
        System.out.println(xRepo.findAll().size() + " ban ghi. - " + Timestamp.from(Instant.now()));
    }
}
