package io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.factory.concrete;

import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.factory.FurnitureFactory;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.Chair;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.Sofa;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.concrete.victorian.VictorianChair;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.concrete.victorian.VictorianSofa;

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
