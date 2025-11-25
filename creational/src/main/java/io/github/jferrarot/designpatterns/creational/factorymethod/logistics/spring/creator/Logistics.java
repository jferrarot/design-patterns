package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring.creator;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring.product.Transport;

public abstract class Logistics {
    protected final Transport transport;

    protected Logistics(Transport transport) {
        this.transport = transport;
    }

    public void planDelivery(String destination) {
        transport.deliver();
    }
}
