package com.example.apilab05.controller;

import com.example.apilab05.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/chuyenbay")
public class ChuyenBayController {

    @Autowired
    private ChuyenBayService chuyenBayService;


    @GetMapping("/city")
    public List<String> getALLChuyenBayCitys(String ten){
        return chuyenBayService.getAllChuyenBayDiTu(ten);
    }
}
