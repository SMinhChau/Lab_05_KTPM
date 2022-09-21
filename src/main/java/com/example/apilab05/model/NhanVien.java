package com.example.apilab05.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "nhanvien")
@Data
public class NhanVien {
    @Id
    @Column(name = "manv")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String manv;

    @Column(name = "ten")
    private String ten;

    @Column(name = "luong")
    private Long luong;
}
