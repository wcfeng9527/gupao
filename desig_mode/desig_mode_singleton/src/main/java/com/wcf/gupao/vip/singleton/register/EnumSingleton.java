package com.wcf.gupao.vip.singleton.register;

/**
 * 枚举单例
 * 从JDK底层实现了防止单例被反射和序列号破坏
 * 最佳单例实现方式
 * @author wangchunfeng
 * @create 2019-03-09 21:41
 */
public enum  EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    //具体数据存放
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
