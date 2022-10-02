package com.example.apilab05.controller;

import com.example.apilab05.model.ChuyenBay;
import com.example.apilab05.repository.ChuyenBayRepository;
import com.example.apilab05.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.List;

@RestController
@RequestMapping("/api/chuyenbay")
public class ChuyenBayController {

    @Autowired
    private ChuyenBayService chuyenBayService;


    @GetMapping("/")
    public List<ChuyenBay> fiBays() {
        return chuyenBayService.findChuyenBays();
    }


    @GetMapping("/{gaden}")
    public List<ChuyenBay> getChuyenByByGaden(@PathVariable String gaden) {
        return chuyenBayService.findChuyenBaysByGaden(gaden);
    }

    @GetMapping("/dodai-from-to")
    public List<ChuyenBay> geChuyenBaysDoDaiFromTo(){
        return  chuyenBayService.findChuyenBaysDoDai();
    }


    @GetMapping("/from-to")
    public List<ChuyenBay> geChuyenBaysFromTO(){
        return  chuyenBayService.findChuyenBaysFromSGToBuonMaThuoc();
    }

    @GetMapping("/from-SG")
    public List<ChuyenBay> geChuyenBaysFromSaiGon(){
        return  chuyenBayService.totalsChuyenBaysFromSGN();
    }
}
