package com.example.apilab05.service.serviceImpl;

import com.example.apilab05.repository.ChuyenBayRepository;
import com.example.apilab05.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayImpl implements ChuyenBayService {

    @Autowired
    private ChuyenBayRepository chuyenBayRepository;

    @Override
    public List<String> getAllChuyenBayDiTu(String ten) {
        return chuyenBayRepository.getAllChuyenBayDiTu(ten);
    }
}
