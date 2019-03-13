package com.wcf.gupao.vip.prototype;

import com.wcf.gupao.vip.prototype.deep.ConCretePrototypeB;
import com.wcf.gupao.vip.prototype.simple.ConCretePrototypeA;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板模式测试
 *
 * @author wangchunfeng
 * @create 2019-03-11 12:13
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ConCretePrototypeA prototypeA = new ConCretePrototypeA();

        prototypeA.setName("Tom");
        prototypeA.setAge(33);
        List<String> interestsA = new ArrayList<>();
        interestsA.add("踢球");
        interestsA.add("游泳");
        prototypeA.setInterests(interestsA);

        ConCretePrototypeA copyPrototypeA = (ConCretePrototypeA) Client.clone(prototypeA);
        System.out.println("prototypeA.getName==copyPrototypeA.getName?" + (prototypeA.getName() == copyPrototypeA.getName()));
        System.out.println("prototypeA.getInterests==copyPrototypeA.getInterests?" + (prototypeA.getInterests() == copyPrototypeA.getInterests()));


        ConCretePrototypeB prototypeB = new ConCretePrototypeB();

        prototypeB.setName("Tom");
        prototypeB.setAge(33);
        List<String> interestsB = new ArrayList<>();
        interestsB.add("踢球");
        interestsB.add("游泳");
        prototypeB.setInterests(interestsB);

        ConCretePrototypeB copyPrototypeB = (ConCretePrototypeB) Client.clone(prototypeB);
        System.out.println("prototypeB.getName==copyPrototypeB.getName?" + (prototypeB.getName() == copyPrototypeB.getName()));
        System.out.println("prototypeB.getInterests==copyPrototypeB.getInterests?" + (prototypeB.getInterests() == copyPrototypeB.getInterests()));
    }
}
