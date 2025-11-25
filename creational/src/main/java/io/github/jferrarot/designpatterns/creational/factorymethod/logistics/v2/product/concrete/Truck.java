package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.product.concrete;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.product.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by land in a truck.");
    }
}
