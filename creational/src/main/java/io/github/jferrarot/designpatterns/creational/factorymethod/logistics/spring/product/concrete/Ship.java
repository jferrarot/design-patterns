package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring.product.concrete;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring.product.Transport;
import org.springframework.stereotype.Component;

@Component("ship")
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a ship.");
    }
}
