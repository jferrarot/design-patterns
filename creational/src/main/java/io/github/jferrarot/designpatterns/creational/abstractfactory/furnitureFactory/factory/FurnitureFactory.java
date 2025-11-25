package io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.factory;

import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.Chair;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}
