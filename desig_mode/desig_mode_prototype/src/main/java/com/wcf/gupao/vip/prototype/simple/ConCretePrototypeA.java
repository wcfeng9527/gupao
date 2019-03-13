package com.wcf.gupao.vip.prototype.simple;

import com.wcf.gupao.vip.prototype.Prototype;

/**
 * @author wangchunfeng
 * @create 2019-03-10 20:14
 */
public class ConCretePrototypeA extends Prototype {

    @Override
    public Prototype clone() {
        ConCretePrototypeA conCretePrototype = new ConCretePrototypeA();
        conCretePrototype.setAge(this.getAge());
        conCretePrototype.setName(this.getName());
        conCretePrototype.setInterests(this.getInterests());
        return conCretePrototype;
    }
}
