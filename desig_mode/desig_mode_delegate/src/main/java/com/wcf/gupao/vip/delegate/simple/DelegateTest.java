package com.wcf.gupao.vip.delegate.simple;

/**
 * @author wangchunfeng
 * @create 2019-03-26 11:36
 */
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("架构",new Leader());
        new Boss().command("开发",new Leader());
    }
}
