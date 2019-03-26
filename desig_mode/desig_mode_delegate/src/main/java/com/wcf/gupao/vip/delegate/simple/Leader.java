package com.wcf.gupao.vip.delegate.simple;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangchunfeng
 * @create 2019-03-26 11:28
 */
public class Leader implements IEmployee {

    private static final Map<String, IEmployee> register = new ConcurrentHashMap<>();

    public Leader() {
        register.put("架构", new EmployeeA());
        register.put("开发", new EmployeeB());
    }

    @Override
    public void doing(String command) {
        register.get(command).doing(command);
    }
}
