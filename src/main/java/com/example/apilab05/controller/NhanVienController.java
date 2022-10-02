package com.example.apilab05.controller;

import com.example.apilab05.model.NhanVien;
import com.example.apilab05.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;


    @GetMapping("/nhanvien")
    public List<NhanVien> findAllNhanViens(){
        List<NhanVien> nhanViens= nhanVienService.findAllNhanViens();
        return nhanViens;
    }

    @GetMapping("/nhanvien/luong")
    public List<NhanVien> findNhanViensLuong(){
        List<NhanVien> nhanViens= nhanVienService.findNhanViensLuong();
        return nhanViens;
    }


}
