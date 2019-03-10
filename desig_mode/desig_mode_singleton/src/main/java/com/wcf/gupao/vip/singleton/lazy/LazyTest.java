package com.wcf.gupao.vip.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * @author wangchunfeng
 * @create 2019-03-09 21:04
 */
public class LazyTest {

    public static void main(String[] args) {
        innerClassSingletonTest();
    }

    //内部类反射破坏单例测试
    private static void innerClassSingletonTest() {
        Class<?> clazz = LazyInnerClassSingleton.class;
        LazyInnerClassSingleton obj1 = null;
        try {
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            obj1 = (LazyInnerClassSingleton)constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        LazyInnerClassSingleton obj2 = LazyInnerClassSingleton.getInstance();
        System.out.println(obj1 ==obj2);
    }
}
