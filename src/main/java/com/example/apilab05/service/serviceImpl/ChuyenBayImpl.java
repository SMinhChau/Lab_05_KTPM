package com.example.apilab05.service.serviceImpl;

import com.example.apilab05.model.ChuyenBay;
import com.example.apilab05.repository.ChuyenBayRepository;
import com.example.apilab05.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChuyenBayImpl implements ChuyenBayService {

    @Autowired
    private ChuyenBayRepository chuyenBayRepository;

    @Override
    public List<ChuyenBay> findChuyenBaysByGaden(String gaden) {
        return chuyenBayRepository.findChuyenBaysByGaden(gaden);
    }

    @Override
    public List<ChuyenBay> findChuyenBays() {
        return chuyenBayRepository.findAll();
    }

    @Override
    public List<ChuyenBay> findChuyenBaysDoDai() {
        return chuyenBayRepository.findChuyenBaysDoDai();
    }


}
