package com.skeiatate.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SkeiATate
 * <p>
 * 衣物实体类
 */
@Entity
@Table(name = "tb_clothes")
public class Clothes {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    // 衣物名称,后面用于模糊搜索
    private String title;

    @OneToMany(targetEntity = Color.class,fetch = FetchType.EAGER)
    @JoinTable(name = "tb_clothes_colors",
            joinColumns = {@JoinColumn(name = "clothes_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "colors_id", referencedColumnName = "id")})
    /**
     * 颜色描述
     */
    private List<Color> colors;

    @Column(name = "location")
    /**
     *衣物的位置
     */
    private String location;

    @Column(name = "img")
    //衣物的图片路径,重点会处理这部分
    private String img;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Color> getColors() {
        if (colors==null){
            colors = new ArrayList<>();
        }
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", colors=" + colors +
                ", location='" + location + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
