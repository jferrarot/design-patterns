package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.creator.concrete;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.creator.Logistics;
import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.product.Transport;
import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.product.concrete.Truck;

public class RoadLogistics extends Logistics {
    @Override
    protected Transport createTransport(String destination) {
        if (destination.equalsIgnoreCase("local") ||
                destination.equalsIgnoreCase("domestic")) {
            return new Truck();
        }
        return new Truck(); // business default
    }
}
