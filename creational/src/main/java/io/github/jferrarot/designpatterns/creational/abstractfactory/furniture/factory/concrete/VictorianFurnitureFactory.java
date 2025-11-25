package io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.factory.concrete;

import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.factory.FurnitureFactory;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.Chair;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.Sofa;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.concrete.victorian.VictorianChair;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.concrete.victorian.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
