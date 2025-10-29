package com.example.sd2020333.recheck1.service;

import com.example.sd2020333.recheck1.model.GauBong;
import com.example.sd2020333.recheck1.repository.GauBongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GauBongService {
    @Autowired
    GauBongRepo gbRepo;

    public List<GauBong> getAll() {
        return gbRepo.findAll();
    }
    public GauBong getOne(Integer id) {
        return gbRepo.findById(id).get();
    }
    public void addGB(GauBong gb) {
        gbRepo.save(gb);
    }
    public void updateGB(GauBong gb) {
        gbRepo.save(gb);
    }
    public void deleteGB(Integer id) {
        gbRepo.deleteById(id);
    }

}
