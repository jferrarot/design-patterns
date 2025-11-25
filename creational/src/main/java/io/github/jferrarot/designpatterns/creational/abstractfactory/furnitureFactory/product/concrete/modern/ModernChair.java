package io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.concrete.modern;

import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.Chair;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Modern chair with metallic legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair.");
    }
}
