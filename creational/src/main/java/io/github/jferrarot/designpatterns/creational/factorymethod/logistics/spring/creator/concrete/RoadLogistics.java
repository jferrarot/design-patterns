package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring.creator.concrete;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring.creator.Logistics;
import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring.product.Transport;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RoadLogistics extends Logistics {
    public RoadLogistics(@Qualifier("truck") Transport transport) {
        super(transport);
    }
}
