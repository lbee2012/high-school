package com.example.sd2020333.bang2.service;

import com.example.sd2020333.bang2.model.NhanVien;
import com.example.sd2020333.bang2.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    NhanVienRepository nvRepo;

    public List<NhanVien> getAll() {
        return nvRepo.findAll();
    }
    public NhanVien getOne(Integer id) {
        return nvRepo.findById(id).get();
    }
    public void addNV(NhanVien nv) {
        nvRepo.save(nv);
    }
    public void updateNV(NhanVien nv) {
        nvRepo.save(nv);
    }
    public void deleteNV(Integer id) {
        nvRepo.deleteById(id);
    }

}
