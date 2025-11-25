package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v1.creator.concrete;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v1.creator.Logistics;
import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v1.product.Transport;
import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v1.product.concrete.Ship;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
