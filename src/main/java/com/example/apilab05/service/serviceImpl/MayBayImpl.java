package com.example.apilab05.service.serviceImpl;

import com.example.apilab05.model.MayBay;
import com.example.apilab05.repository.MayBayRepository;
import com.example.apilab05.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MayBayImpl implements MayBayService {

    @Autowired
    private MayBayRepository mayBayRepository;

    @Override
    public List<MayBay> findMayBaysTamBayFrom() {
        return mayBayRepository.findMayBaysTamBayFrom();
    }

    @Override
    public List<MayBay> findLoaiMayBaysBoeing() {
        return mayBayRepository.findLoaiMayBaysBoeing();
    }

    @Override
    public List<MayBay> findMayBaysByTenNhanVien() {
        return mayBayRepository.findMayBaysByTenNhanVien();
    }
}
