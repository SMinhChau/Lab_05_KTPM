package com.example.apilab05.service;

import com.example.apilab05.model.MayBay;
import com.example.apilab05.model.NhanVien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NhanVienService {
    List<NhanVien> findNhanViensLuong();

    Float getTotalSalaryAllNhanVien();

    List<NhanVien> findNhanViensGroupByLoaiMayBays();
}
