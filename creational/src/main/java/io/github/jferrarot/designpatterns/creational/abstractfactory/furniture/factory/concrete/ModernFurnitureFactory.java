package io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.factory.concrete;

import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.factory.FurnitureFactory;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.Chair;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.Sofa;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.concrete.modern.ModernChair;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.concrete.modern.ModernSofa;

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
