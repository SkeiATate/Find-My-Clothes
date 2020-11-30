package com.skeiatate.controller;

import com.skeiatate.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author SkeiATate
 */
@Controller
public class ClothesController {

    @Autowired
    private ClothesService clothesService;


}
