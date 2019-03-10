package com.wcf.gupao.vip.singleton.threadlocal;

/**
 * 本地线程单例
 *
 * @author wangchunfeng
 * @create 2019-03-10 18:58
 */
public class ThreadLocalSingleton {

    private static ThreadLocal threadLocal = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {
    }
    //伪单例，在同一个线程下是可以实现单例的，但是在不同的线程中就是不同的实例
    public static ThreadLocalSingleton getInstance() {
        return (ThreadLocalSingleton)threadLocal.get();
    }
}
