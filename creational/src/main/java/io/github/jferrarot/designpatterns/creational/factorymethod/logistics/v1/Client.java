package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v1;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v1.creator.Logistics;
import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v1.creator.concrete.RoadLogistics;

public class Client {
    public void run(){
        Logistics logistics;

        logistics = new RoadLogistics();
        logistics.planDelivery();

        logistics = new RoadLogistics();
        logistics.planDelivery();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
