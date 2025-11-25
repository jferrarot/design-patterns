package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring.product.concrete;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring.product.Transport;
import org.springframework.stereotype.Component;

@Component("truck")
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by land in a truck.");
    }
}
