package com.example.apilab05.repository;

import com.example.apilab05.model.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    List<String> getAllChuyenBayDiTu(String ten);
}
