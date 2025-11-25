package io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.concrete.victorian;

import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.Chair;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Victorian chair with elegant curved legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair.");
    }
}
