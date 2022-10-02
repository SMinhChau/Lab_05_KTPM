package com.example.apilab05.service;

import com.example.apilab05.model.ChuyenBay;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ChuyenBayService {
    List<ChuyenBay> findChuyenBaysByGaden(String gaden);

    List<ChuyenBay> findChuyenBays();

    List<ChuyenBay> findChuyenBaysDoDai();

    List<ChuyenBay> findChuyenBaysFromSGToBuonMaThuoc();

    List<ChuyenBay> totalsChuyenBaysFromSGN();


}
