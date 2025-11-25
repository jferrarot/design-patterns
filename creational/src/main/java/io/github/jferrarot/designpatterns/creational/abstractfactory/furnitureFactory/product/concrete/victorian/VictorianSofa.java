package io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.concrete.victorian;

import io.github.jferrarot.designpatterns.creational.abstractfactory.furnitureFactory.product.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void space() {
        System.out.println("Victorian sofa with lots of space.");
    }

    @Override
    public void material() {
        System.out.println("Victorian sofa made of velvet.");
    }
}
