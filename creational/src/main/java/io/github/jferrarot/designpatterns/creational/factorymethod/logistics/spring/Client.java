package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring.creator.Logistics;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Client {
    private final Logistics logistics;

    public Client(@Qualifier("roadLogistics") Logistics logistics) {
        this.logistics = logistics;
    }

    public void run() {
        logistics.planDelivery("Lima");
    }
}
