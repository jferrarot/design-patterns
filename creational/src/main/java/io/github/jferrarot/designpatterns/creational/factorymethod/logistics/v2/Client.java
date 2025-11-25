package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2;

import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.creator.Logistics;
import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.creator.concrete.RoadLogistics;
import io.github.jferrarot.designpatterns.creational.factorymethod.logistics.v2.creator.concrete.SeaLogistics;

public class Client {
    public void run() {
        Logistics logistics;

        String mode = "sea";

        if (mode.equals("road")) {
            logistics = new RoadLogistics();
        } else {
            logistics = new SeaLogistics();
        }

        logistics.planDelivery("international");
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
