package com.wcf.gupao.vip.delegate.simple;

/**
 * @author wangchunfeng
 * @create 2019-03-26 11:28
 */
public class EmployeeA implements IEmployee {


    @Override
    public void doing(String command) {
        System.out.println("员工"+this.getClass().getSimpleName()+"进行工作"+command);
    }
}
