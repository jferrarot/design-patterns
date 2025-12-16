package io.github.jferrarot.designpatterns.structural.proxy.internet.real;

import io.github.jferrarot.designpatterns.structural.proxy.internet.api.Internet;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String host) throws Exception{
        System.out.println("Connecting to " + host);
    }
}
