package com.skeiatate.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author SkeiATate
 * 衣物颜色实体类
 */
@Entity
@Data
@Table(name = "tb_color")
public class ClothesColor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    //颜色名称
    private String colorName;

    @Column
    @OneToMany(fetch = FetchType.EAGER)
    //颜色下包含的衣服
    private List<Clothes> clothesList;
}
