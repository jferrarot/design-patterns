package io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.concrete.modern;

import io.github.jferrarot.designpatterns.creational.abstractfactory.furniture.product.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void space() {
        System.out.println("Modern sofa with minimalist design.");
    }

    @Override
    public void material() {
        System.out.println("Modern sofa made of synthetic materials.");
    }
}
