package com.example.apilab05.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "chungnhan")
@Data
@IdClass(ChungNhanPK.class)
public class ChungNhan implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "ma_mv")
    private NhanVien manv;

    @Id
    @ManyToOne
    @JoinColumn(name = "ma_mb")
    private MayBay mamb;
}
