package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tentinh")
public class Tinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tenTinh;
    @OneToMany(targetEntity = BaiViet.class)
    private List<BaiViet> baiViets;

    public Tinh() {
    }

    public List<BaiViet> getBaiViets() {
        return baiViets;
    }

    public void setBaiViets(List<BaiViet> baiViets) {
        this.baiViets = baiViets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }
}
