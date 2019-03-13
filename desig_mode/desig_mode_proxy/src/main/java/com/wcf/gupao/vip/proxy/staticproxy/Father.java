package com.wcf.gupao.vip.proxy.staticproxy;

import com.wcf.gupao.vip.proxy.Person;

/**
 * @author wangchunfeng
 * @create 2019-03-11 18:10
 */
public class Father implements Person {
    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    @Override
    public void findLove() {
        System.out.println("父亲开始代理找对象");
        person.findLove();
        System.out.println("父亲代理找对象完成");
    }

}
