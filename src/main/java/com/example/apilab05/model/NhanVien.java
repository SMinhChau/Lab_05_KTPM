package com.example.apilab05.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "nhanvien")
@Data
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String manv;

    @Column(name = "ten")
    private String ten;

    @Column(name = "luong")
    private Long luong;
}
