package com.wcf.gupao.vip.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wangchunfeng
 * @create 2019-03-11 18:14
 */
public class MeiPoProxy implements InvocationHandler {

    private Object target;

    public Object bing(Object target) {
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆，我可以代理任何东西，不只是找对象哦");
        Object obj = method.invoke(target, args);
        System.out.println("我是媒婆，代理的任务完成啦");
        return obj;
    }
}
