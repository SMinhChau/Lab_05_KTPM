package com.example.apilab05;

import com.example.apilab05.model.ChuyenBay;
import com.example.apilab05.model.MayBay;
import com.example.apilab05.repository.ChuyenBayRepository;
import com.example.apilab05.repository.NhanVienRepository;
import com.example.apilab05.service.ChuyenBayService;
import com.example.apilab05.service.MayBayService;
import com.example.apilab05.service.NhanVienService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Apilab05ApplicationTests {
    @Autowired
    private ChuyenBayService chuyenBayService;

    @Autowired
    private MayBayService mayBayService;

    @Autowired
    private NhanVienService nhanVienService;

//	@Test
//	void cau01() {
//		System.out.println("=> Cau 01");
//		chuyenBayService.findChuyenBaysByGaden("DAD").stream().forEach(chuyenBay -> {
//			System.out.println(chuyenBay.toString());
//		});
//	}
//
//	@Test
//	void cau02() {
//		System.out.println("=> Cau 02");
//		mayBayService.findMayBaysTamBayFrom().stream().forEach(mb -> {
//			System.out.println(mb.toString());
//		});
//	}


//	@Test
//	void cau03() {
//		System.out.println("=> Cau 03");
//	nhanVienService.findNhanViensLuong().stream().forEach(nv -> {
//			System.out.println(nv.toString());
//		});
//	}


//	@Test
//	void cau04() {
//		System.out.println("=> Cau 04");
//		chuyenBayService.findChuyenBaysDoDai().stream().forEach(cb -> {
//			System.out.println(cb.toString());
//		});
//	}
//
//	@Test
//	void cau05() {
//		System.out.println("=> Cau 05");
//		chuyenBayService.findChuyenBaysFromSGToBuonMaThuoc().stream().forEach(cb -> {
//			System.out.println(cb.toString());
//		});
//	}

    //	@Test
//	void cau6() {
//		System.out.println("=> Cau 06");
//		int total=0;
//		List<ChuyenBay> list= chuyenBayService.totalsChuyenBaysFromSGN();
//		for (ChuyenBay cb: list) {
//		total++;
//		}
//		System.out.println("Tổng chuyến bay xuất phát từ Sài Gòn (SGN):" +total);
//	}

//    @Test
//    void cau7() {
//        System.out.println("=> Cau 07");
//        int total = 0;
//        List<MayBay> list = mayBayService.findLoaiMayBaysBoeing();
//        for (MayBay cb : list) {
//            total++;
//        }
//        System.out.println("Tổng loại máy báy Boeing:" + total);
//    }

    @Test
    void cau8() {
        System.out.println("=> Cau 08");
      Float total = nhanVienService.getTotalSalaryAllNhanVien();
        System.out.println("Tổng số lương phải trả cho các nhân viên: " + total);
    }
}
