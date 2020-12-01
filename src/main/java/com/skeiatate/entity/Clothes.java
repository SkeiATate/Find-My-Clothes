package com.skeiatate.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author SkeiATate
 * <p>
 * 衣物实体类
 */
@Entity
@Data
@Table(name = "tb_clothes")
public class Clothes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column
    // 衣物名称,后面用于模糊搜索
    private String title;

    @ManyToMany(targetEntity = ClothesColor.class, cascade = CascadeType.ALL)
    @JoinTable(name = "tb_clothes_colors",
            joinColumns = {@JoinColumn(name = "clothes_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "colors_id", referencedColumnName = "id")})
    /**
     * 颜色描述
     */
    private List<ClothesColor> colors;

    @Column
    /**
     *衣物的位置
     */
    private String location;

    @Column
    //衣物的图片路径,重点会处理这部分
    private String img;
}
