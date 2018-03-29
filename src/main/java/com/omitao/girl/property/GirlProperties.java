package com.omitao.girl.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by omitao on 2018/2/11
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    
    private String cupSize;
    
    private int age;


    public String getCupSize() {
        return cupSize;
    }

    public int getAge() {
        return age;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
