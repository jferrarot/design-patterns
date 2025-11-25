package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.creator.concrete;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.creator.Logistics;
import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.product.Transport;
import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.product.concrete.Ship;

public class SeaLogistics extends Logistics {
    @Override
    protected Transport createTransport(String destination) {
        if (destination.equalsIgnoreCase("international") ||
                destination.equalsIgnoreCase("overseas")) {
            return new Ship();
        }

        return new Ship();
    }
}
