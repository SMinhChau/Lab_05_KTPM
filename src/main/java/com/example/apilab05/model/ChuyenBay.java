package com.example.apilab05.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "chuyenbay")
@Data
public class ChuyenBay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String macb;

    @Column(name = "gadi")
    private String gadi;

    @Column(name = "gaden")
    private String gaden;

    @Column(name = "dodai")
    private Long dodai;

    @Column(name = "giodi")
    private Time giodi;

    @Column(name = "gioden")
    private Time gioden;

    @Column(name = "chiphi")
    private Long chiphi;
}
