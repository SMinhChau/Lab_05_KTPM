package com.example.apilab05.service;

import com.example.apilab05.model.MayBay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MayBayService{
    List<MayBay> findMayBaysTamBayFrom();
}
