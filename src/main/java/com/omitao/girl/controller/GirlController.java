package com.omitao.girl.controller;

import com.omitao.girl.aspect.HttpAspect;
import com.omitao.girl.bean.Girl;
import com.omitao.girl.mapper.GirlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by omitao on 2018/2/11
 */
@RestController
public class GirlController {

    Logger logger = LoggerFactory.getLogger(GirlController.class);

    @Autowired
    private GirlMapper girlMapper;

    @GetMapping(value = "/get")
    public List<Girl> queryGirlsList(){
        return girlMapper.findAll();

    }

    @PostMapping(value = "/post")
    public Girl addGirl(@Valid Girl girl){
//        if(bindingResult.hasErrors()){
//            logger.info(bindingResult.getFieldError().getDefaultMessage());
//        }
        logger.info("girlsList");
        return girlMapper.save(girl);

    }
}
