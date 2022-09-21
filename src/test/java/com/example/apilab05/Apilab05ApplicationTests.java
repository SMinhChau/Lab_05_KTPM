package com.example.apilab05;

import com.example.apilab05.repository.ChuyenBayRepository;
import com.example.apilab05.repository.NhanVienRepository;
import com.example.apilab05.service.ChuyenBayService;
import com.example.apilab05.service.MayBayService;
import com.example.apilab05.service.NhanVienService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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


	@Test
	void cau03() {
		System.out.println("=> Cau 03");
	nhanVienService.findNhanViensLuong().stream().forEach(nv -> {
			System.out.println(nv.toString());
		});
	}

}
