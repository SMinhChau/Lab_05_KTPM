package com.example.apilab05.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChuyenBayService {
    List<String> getAllChuyenBayDiTu(String ten);
}
