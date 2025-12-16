package io.github.jferrarot.designpatterns.structural.proxy.internet.client;

import io.github.jferrarot.designpatterns.structural.proxy.internet.api.Internet;
import io.github.jferrarot.designpatterns.structural.proxy.internet.proxy.ProxyInternet;

public class Client {
    public void run() {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("example.com");
            internet.connectTo("https://www.abc.io");
        } catch (Exception e) {
            System.out.println("Error during connecting to " + e.getMessage());
        }

    }
}
