package com.wcf.gupao.vip.singleton.lazy;

/**
 * 双重检查懒汉式单例
 *
 * @author wangchunfeng
 * @create 2019-03-09 20:43
 */
public class LazyDoubleCheckSingleton {
    /*
        volatile 作用：可见性和顺序性
     */
    private static volatile LazyDoubleCheckSingleton INSTANCE = null;

    private LazyDoubleCheckSingleton() { }

    public static LazyDoubleCheckSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (INSTANCE) {
                if (INSTANCE == null) {
                    /**
                     * 类的初始化过程：
                     * 1.分配内存空间
                     * 2.在内存中创建对象
                     * 3.将变量指向分配的内存空间
                     *
                     * jvm在加载过程中会指令重排，导致2、3步骤出现颠倒
                     * 可能会出现INSTANCE已经指向了内存空间，但是实际对象还没有被创建出来的情况，
                     * 这样的话在使用INSTANCE的时候可能会出现报错的情况
                     * 所以需要加上volatile来防止指令重排的出现
                     **/
                    INSTANCE = new LazyDoubleCheckSingleton();

                }
            }
        }
        return INSTANCE;
    }
}
