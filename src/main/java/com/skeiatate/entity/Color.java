package com.skeiatate.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SkeiATate
 * 衣物颜色实体类
 */
@Entity
@Table(name = "tb_color")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    /**
     *颜色名称
     */
    private String colorName;

    @ManyToMany(mappedBy = "colors")
    /**
     *颜色下包含的衣服
     */
    private List<Clothes> clothesList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public List<Clothes> getClothesList() {
        if (clothesList == null) {
            clothesList = new ArrayList<>();
        }
        return clothesList;
    }

    public void setClothesList(List<Clothes> clothesList) {
        this.clothesList = clothesList;
    }

    @Override
    public String toString() {
        return "Color{" +
                "id=" + id +
                ", colorName='" + colorName + '\'' +
                ", clothesList=" + clothesList +
                '}';
    }
}
