package com.example.apilab05.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "maybay")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MayBay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mamb")
    private String mamb;

    @Column(name = "loai")
    private String loai;

    @Column(name = "tambay")
    private Long tambay;



}
