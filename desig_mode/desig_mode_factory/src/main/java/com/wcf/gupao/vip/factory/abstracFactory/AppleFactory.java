package com.wcf.gupao.vip.factory.abstracFactory;

import com.wcf.gupao.vip.factory.product.IAppliance;
import com.wcf.gupao.vip.factory.product.ICar;
import com.wcf.gupao.vip.factory.product.Television;
import com.wcf.gupao.vip.factory.product.Truck;

/**
 * 苹果工厂
 *
 * @author wangchunfeng
 * @create 2019-03-08 10:47
 */
public class AppleFactory implements IFactory {
    @Override
    public ICar createCar() {
        System.out.println("苹果工厂造卡车");
        return new Truck();
    }

    @Override
    public IAppliance createAppliance() {
        System.out.println("苹果工厂造电视机");
        return new Television();
    }
}
