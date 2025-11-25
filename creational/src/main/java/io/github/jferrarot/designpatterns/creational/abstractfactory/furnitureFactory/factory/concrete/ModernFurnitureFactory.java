package io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.factory.concrete;

import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.factory.FurnitureFactory;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.Chair;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.Sofa;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.concrete.modern.ModernChair;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.concrete.modern.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
