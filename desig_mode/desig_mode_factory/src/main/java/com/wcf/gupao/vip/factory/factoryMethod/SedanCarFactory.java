package com.wcf.gupao.vip.factory.factoryMethod;

import com.wcf.gupao.vip.factory.product.ICar;
import com.wcf.gupao.vip.factory.product.SedanCar;

/**
 * @author wangchunfeng
 * @create 2019-03-08 10:07
 */
public class SedanCarFactory extends AbstractCarFactory {

    @Override
    public ICar doCreate() {
        return new SedanCar();
    }
}
