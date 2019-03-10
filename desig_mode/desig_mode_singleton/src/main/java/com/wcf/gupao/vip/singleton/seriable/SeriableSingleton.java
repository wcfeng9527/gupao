package com.wcf.gupao.vip.singleton.seriable;

import java.io.Serializable;

/**
 * 饿汉式单例
 *
 * @author wangchunfeng
 * @create 2019-03-09 20:28
 */
public class SeriableSingleton implements Serializable {

    private static final long serialVersionUID = -7219401430073721161L;
    private static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() { }

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }


    /*
       加上该方法，能防止通过序列化的方式来破坏单例
       原因：在ObjectInputStream的readObject方法中，最终会调用一个readOrdinaryObject方法来读取流中的对象
       其中有一个判断obj = desc.isInstantiable() ? desc.newInstance() : null; 即是否有反射创建对象的类，
       这里肯定是有的，所以可以创建对象。
       但是后续还有一个赋值过程
        if(obj!=null && desc.hasReadResolveMethod()){
            Object rep = desc.invokeReadResolve(obj);
        }
        if (rep != obj) {
            handles.setObject(passHandle, obj = rep);
        }
        理解起来就是desc调用一个invokeReadResolve方法返回一个对象，如果返回的对象和obj不一样，那么最终返回的方法是rep对象
        那么invokeReadResolve中是怎么操作的呢？
        if (readResolveMethod != null) {
            return readResolveMethod.invoke(obj, (Object[]) null);
        }
        通过反射的形式调用readResolveMethod方法创建的类，那么readResolveMethod的值是什么呢？
        readResolveMethod = getInheritableMethod(
                        cl, "readResolve", null, Object.class);
        赋值的地方，即为readResolve方法。
        所以，我们可以通过在类中定义一个readResolve方法，并在方法中返回类中的单例对象，来达到防止序列化的方式破坏单例。
        但是这个方式在实际上已经生成了一个额外的类，只不过这个类没有明确的引用关系，所以会在GC的时候被回收掉
     */
    private Object readResolve() {
        return INSTANCE;
    }
}
