package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring.creator.concrete;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring.creator.Logistics;
import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring.product.Transport;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@profile("sea")
// --spring.profiles.active=sea (enable this bean)
public class SeaLogistics extends Logistics {
    public SeaLogistics(@Qualifier("ship") Transport transport) {
        super(transport);
    }
}
