package com.wcf.gupao.vip.singleton.lazy;

/**
 * 简单 懒汉式单例
 *
 * @author wangchunfeng
 * @create 2019-03-09 20:41
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance = null;

    private LazySimpleSingleton() {
    }
    //阻塞其他线程，会有性能上的问题
    public synchronized static LazySimpleSingleton getInstance() {

        if (instance == null) {
            instance = new LazySimpleSingleton();
        }

        return instance;
    }
}
