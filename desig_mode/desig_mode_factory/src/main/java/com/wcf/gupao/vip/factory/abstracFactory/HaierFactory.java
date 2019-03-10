package com.wcf.gupao.vip.factory.abstracFactory;

import com.wcf.gupao.vip.factory.product.IAppliance;
import com.wcf.gupao.vip.factory.product.ICar;
import com.wcf.gupao.vip.factory.product.Refrigerator;
import com.wcf.gupao.vip.factory.product.SedanCar;

/**
 * 海尔工厂
 *
 * @author wangchunfeng
 * @create 2019-03-08 10:46
 */
public class HaierFactory implements IFactory {
    @Override
    public ICar createCar() {
        System.out.println("海尔工厂造小汽车");
        return new SedanCar();
    }

    @Override
    public IAppliance createAppliance() {
        System.out.println("海尔工厂造冰箱");
        return new Refrigerator();
    }
}
