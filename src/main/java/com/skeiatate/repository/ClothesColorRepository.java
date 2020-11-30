package com.skeiatate.repository;

import com.skeiatate.entity.ClothesColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SkeiATate
 * @date 2020/11/30
 */
@Repository
public interface ClothesColorRepository extends JpaRepository<ClothesColor,Integer> {
}
