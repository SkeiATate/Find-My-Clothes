package com.skeiatate.test;

import com.skeiatate.entity.Clothes;
import com.skeiatate.entity.Color;
import com.skeiatate.repository.ColorRepository;
import com.skeiatate.repository.ClothesRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author SkeiATate
 * @date 2020/12/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTest {

    @Autowired
    private ClothesRepository clothesRepository;

    @Autowired
    private ColorRepository colorRepository;


    @Test
    @Transactional
    @Rollback(false)
    public void addAllTest() {
        Clothes clothes = new Clothes();
        clothes.setTitle("黄色毛衣");
        clothes.setLocation("阳台衣柜左侧中层");
        clothes.setImg("图片地址");
        Color color = new Color();
        color.setColorName("黄色");

        clothes.getColors().add(color);
        color.getClothesList().add(clothes);

        clothesRepository.save(clothes);
        colorRepository.save(color);

    }

    @Test
     public void findTest(){
         Color color = new Color();
         color.setId(1);

         Optional<Color> byId = colorRepository.findById(1);
         Color color1 = byId.get();
         System.out.println(color1);
     }
}
