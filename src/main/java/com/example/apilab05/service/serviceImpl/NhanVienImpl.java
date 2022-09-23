package com.example.apilab05.service.serviceImpl;



import com.example.apilab05.model.NhanVien;
import com.example.apilab05.repository.NhanVienRepository;
import com.example.apilab05.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienImpl implements NhanVienService {


    @Autowired
    private NhanVienRepository nhanVienRepository;


    @Override
    public List<NhanVien> findNhanViensLuong() {
        return nhanVienRepository.findNhanViensLuong();
    }

    @Override
    public Float getTotalSalaryAllNhanVien() {
       return nhanVienRepository.getTotalSalaryAllNhanVien();
    }

    @Override
    public List<NhanVien> findNhanViensGroupByLoaiMayBays() {
        return nhanVienRepository.findNhanViensGroupByLoaiMayBays();
    }

    @Override
    public List<NhanVien> findNhanViensByMaSo() {
        return nhanVienRepository.findNhanViensByMaSo();
    }
}
