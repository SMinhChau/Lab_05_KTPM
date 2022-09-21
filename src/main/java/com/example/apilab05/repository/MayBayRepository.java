package com.example.apilab05.repository;


import com.example.apilab05.model.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, String> {
    @Query(
            value = "SELECT * FROM maybay u WHERE u.tambay>10000",
            nativeQuery = true)
    List<MayBay> findMayBaysTamBayFrom();


}
