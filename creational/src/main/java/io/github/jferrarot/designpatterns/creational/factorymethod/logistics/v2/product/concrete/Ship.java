package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.product.concrete;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.product.Transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a ship.");
    }
}
