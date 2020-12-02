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
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "color_name")
    /**
     *颜色名称
     */
    private String colorName;

    @OneToMany(targetEntity = Clothes.class,fetch = FetchType.EAGER)
    @JoinTable(name = "tb_clothes_colors",
    joinColumns = @JoinColumn(name = "colors_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "clothes_id",referencedColumnName = "id"))
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
