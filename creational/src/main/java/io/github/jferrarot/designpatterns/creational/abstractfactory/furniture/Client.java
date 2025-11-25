package io.github.jferrarot.designpatterns.creational.abstractfactory.furniture;

import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.factory.FurnitureFactory;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.Chair;
import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.Sofa;

public class Client {
    private final FurnitureFactory factory;

    public Client(FurnitureFactory furnitureFactory) {
        this.factory = furnitureFactory;
    }

    public void run() {
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        chair.hasLegs();
        chair.sitOn();

        sofa.space();
        sofa.material();
    }
}
