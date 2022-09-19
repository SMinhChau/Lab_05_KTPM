package com.example.apilab05.model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
@Data
public class ChungNhanPK  implements Serializable {
    private String nhanvien;
    private String maybay;
}
