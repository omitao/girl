package com.omitao.girl.controller;

import com.omitao.girl.property.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by omitao on 2018/2/11
 */
@RestController
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private int age;

    @Autowired
    private GirlProperties girlProperties;


    @RequestMapping(value = "/cup",method = RequestMethod.GET)
    public String sayCup(){
        return girlProperties.getCupSize();
    }

    @RequestMapping(value = "/age",method = RequestMethod.GET)
    public int sayAge(){
        return girlProperties.getAge();
    }

}
