package com.wangjie.androidadapter.sample.model;

import java.io.Serializable;

/**
 * Created by wangjie on 11/18/15.
 */
public class Person implements Serializable{
    private String name;
    private int age;
    private int type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
