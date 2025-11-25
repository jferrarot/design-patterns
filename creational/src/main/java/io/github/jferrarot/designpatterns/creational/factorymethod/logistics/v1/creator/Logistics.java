package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v1.creator;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v1.product.Transport;

public abstract class Logistics {

    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
