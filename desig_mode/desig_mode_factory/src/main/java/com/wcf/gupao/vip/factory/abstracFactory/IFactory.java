package com.wcf.gupao.vip.factory.abstracFactory;

import com.wcf.gupao.vip.factory.product.IAppliance;
import com.wcf.gupao.vip.factory.product.ICar;

/**
 * created by wangchunfeng on 2019/3/8
 */
public interface IFactory {

    ICar createCar();

    IAppliance createAppliance();

}
