package com.wcf.gupao.vip.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例
 *
 * @author wangchunfeng
 * @create 2019-03-09 22:35
 */
public class RegisterSingleton {

    private static final Map<String, Object> register = new ConcurrentHashMap<>();

    private RegisterSingleton(){}

    /*
        注册式单例，spring中的实现方式
     */
    public static Object getInstance(String calssName) {
        if (!register.containsKey(calssName)) {
            synchronized (register) {
                if (!register.containsKey(calssName)) {
                    try {
                        //使用简单工厂方法
                        Object obj = Class.forName(calssName).newInstance();
                        register.put(calssName, obj);
                        return obj;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return register.get(calssName);
    }
}
