package io.github.jferrarot.designpatterns.structural.proxy.internet.proxy;

import io.github.jferrarot.designpatterns.structural.proxy.internet.api.Internet;
import io.github.jferrarot.designpatterns.structural.proxy.internet.real.RealInternet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private RealInternet realInternet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("https://www.abc.io");
        bannedSites.add("https://www.cde.io");
        bannedSites.add("https://www.efg.io");
    }

    @Override
    public void connectTo(String host) throws Exception {
        if(bannedSites.contains(host)) {
            throw new Exception("Access denied to " + host);
        }
        realInternet.connectTo(host);
    }
}
