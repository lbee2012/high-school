package com.example.sd202033.buoi10.service;

import com.example.sd202033.buoi10.model.DanhMuc;
import com.example.sd202033.buoi10.repository.DanhMucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucService {
    @Autowired
    DanhMucRepository danhMucRepository;

    public List<DanhMuc> getAllDanhMuc() {
        return danhMucRepository.findAll();
    }

    public DanhMuc getDanhMucById(Integer id) {
        return danhMucRepository.findById(id).get();
    }

    public void addDanhMuc(DanhMuc danhMuc) {
        danhMucRepository.save(danhMuc);
    }

    public void updateDanhMuc(DanhMuc danhMuc) {
        danhMucRepository.save(danhMuc);
    }

    public void deleteDanhMucById(Integer id) {
        danhMucRepository.deleteById(id);
    }
}