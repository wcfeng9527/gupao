package com.wcf.gupao.vip.singleton.threadlocal;

/**
 * @author wangchunfeng
 * @create 2019-03-10 19:01
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance);
        ThreadLocalSingleton instance3 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance3);
        ThreadLocalSingleton instance4 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance4);
        ThreadLocalSingleton instance5 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance5);
        new Thread(()->{
            ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
            System.out.println(Thread.currentThread().getName()+":"+instance2);
        }).start();

        new Thread(()->{
            ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
            System.out.println(Thread.currentThread().getName()+":"+instance2);
        }).start();
    }
}
