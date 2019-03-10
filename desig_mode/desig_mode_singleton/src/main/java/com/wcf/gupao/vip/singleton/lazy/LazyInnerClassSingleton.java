package com.wcf.gupao.vip.singleton.lazy;

/**
 * 内部类单例
 *
 * @author wangchunfeng
 * @create 2019-03-09 20:49
 */
public class LazyInnerClassSingleton {

    //当判断InnerClass.INSTANCE != null时，就会去加载内部类的静态变量的初始化过程，会被赋值
    //所以肯定不会为空，相当于即使通过反射时也会去实际加载内部类的单实例。将初始化过程给提前了
    private LazyInnerClassSingleton(){
        if (InnerClass.INSTANCE != null) {
            throw new RuntimeException("不允许构建多个单例");
        }
    }

    public static LazyInnerClassSingleton getInstance() {
        return InnerClass.INSTANCE;
    }
    /*
        关于静态内部类的加载时机：
        根据JVM规范，类的加载时机有且只有5中情况：
        1.使用new关键字实例化对象时候、读取或设置一个类的静态字段以及调用一个类的静态方法的时候(final修饰在编译期已经把结果放入常量池了)
        2.使用反射调用的时候
        3.初始化一个类，父类还未初始化，先初始化父类
        4.虚拟机启动时候需要执行main方法的主类
        5.1.7以后动态语言支持时，一个MethodHandl实例最后的解析结果为REF_getStatic、REF_putStatic、REF_invokeStatic的方法句柄，
        且这个方法举兵所对应的类没有初始化的时候（不理解）
        那么内部类单例符合的明显时第一条加载时机，当调用InnerClass.INSTANCE的时候，就会触发内部类的加载过程，
        在加载过程中，会把类的静态变量进行初始化，如果加上final的话，就不是饿汉式了，
     */
    private static class InnerClass {
        private static LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}
