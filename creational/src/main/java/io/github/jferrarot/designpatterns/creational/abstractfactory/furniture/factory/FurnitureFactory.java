package io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.factory;

import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.Chair;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}
