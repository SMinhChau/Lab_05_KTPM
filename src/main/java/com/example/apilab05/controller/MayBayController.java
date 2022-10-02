package com.example.apilab05.controller;

import com.example.apilab05.model.MayBay;
import com.example.apilab05.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MayBayController {

    @Autowired
    private MayBayService mayBayService;

    @GetMapping("/maybay")
    public List<MayBay> getMayBaysFrom(){
        List<MayBay> bays= mayBayService.findMayBaysTamBayFrom();
        return bays;
    }
}
