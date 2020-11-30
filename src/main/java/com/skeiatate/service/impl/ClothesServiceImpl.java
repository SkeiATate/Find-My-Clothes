package com.skeiatate.service.impl;

import com.skeiatate.repository.ClothesRepository;
import com.skeiatate.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author SkeiATate
 * @date 2020/11/30
 */
@Service
public class ClothesServiceImpl implements ClothesService {

    @Autowired
    private ClothesRepository clothesRepository;


}
