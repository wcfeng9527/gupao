package com.wcf.gupao.vip.proxy;

import com.wcf.gupao.vip.proxy.staticproxy.Father;

/**
 * @author wangchunfeng
 * @create 2019-03-11 18:18
 */
public class ProxyTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
        System.out.println("----------------------------------/");
        father = new Father(new Girl());
        father.findLove();
    }
}
