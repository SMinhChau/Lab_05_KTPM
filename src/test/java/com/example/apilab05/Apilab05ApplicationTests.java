package com.example.apilab05;

import com.example.apilab05.repository.ChuyenBayRepository;
import com.example.apilab05.service.ChuyenBayService;
import com.example.apilab05.service.MayBayService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Apilab05ApplicationTests {
	@Autowired
	private ChuyenBayService chuyenBayService;

	@Autowired
	private MayBayService mayBayService;

	@Test
	void cau01() {
		System.out.println("=> Cau 01");
		chuyenBayService.findChuyenBaysByGaden("DAD").stream().forEach(chuyenBay -> {
			System.out.println(chuyenBay.toString());
		});
	}



}
