package com.wcf.gupao.vip.delegate.simple;

/**
 * @author wangchunfeng
 * @create 2019-03-26 11:26
 */
public class Boss {


    public void command(String command,IEmployee employee) {
        employee.doing(command);
    }
}
