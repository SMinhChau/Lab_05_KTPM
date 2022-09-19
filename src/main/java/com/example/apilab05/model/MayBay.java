package com.example.apilab05.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "maybay")
@Data
public class MayBay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String mamb;

    @Column(name = "loai")
    private String loai;

    @Column(name = "tambay")
    private Long tambay;
}
