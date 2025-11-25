package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.creator;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.product.Transport;

public abstract class Logistics {
    public void planDelivery(String destination){
        Transport transport = createTransport(destination);
        transport.deliver();
    }

    protected abstract Transport createTransport(String destination);
}
