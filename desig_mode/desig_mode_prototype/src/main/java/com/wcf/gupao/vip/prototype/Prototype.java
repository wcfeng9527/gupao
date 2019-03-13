package com.wcf.gupao.vip.prototype;

import java.util.List;

/**
 * created by wangchunfeng on 2019/3/10
 */
public abstract class Prototype {
    //姓名
    private String name;
    //年龄
    private int age;
    //爱好
    private List<String> interests;

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

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public abstract  Prototype clone();
}
