package com.wcf.gupao.vip.singleton.hungry;

/**
 * 饿汉式单例
 *
 * @author wangchunfeng
 * @create 2019-03-09 20:28
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() { }
    /*
        饿汉式单例，初始化的时候就完成了单例的实例化，执行效率较高
        缺点就是如果该单例没有被使用的话，会造成内存浪费
        是线程安全的，初始化的时候就完成了实例化
     */
    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
