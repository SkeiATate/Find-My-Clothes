package com.skeiatate.repository;

import com.skeiatate.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author SkeiATate
 * @date 2020/11/30
 */
@Repository
public interface ColorRepository extends JpaRepository<Color, Integer> {
}
