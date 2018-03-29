package com.omitao.girl.bean;

import com.dtdream.cma.common.model.MapperModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by omitao on 2018/2/11
 */
@Entity
public class Girl extends MapperModel {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "cup_size")
    private String cupSize;

//    @Min(value = 18,message = "未成年少女")
    @Column(name = "age")
    private int age;

    public int getId() {
        return id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Girl() {
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }
}
