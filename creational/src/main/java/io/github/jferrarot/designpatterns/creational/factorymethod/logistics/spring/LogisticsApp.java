package io.github.jferrarot.designpatterns.creational.factorymethod.logistics.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LogisticsApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(LogisticsApp.class, args);

        Client client = context.getBean(Client.class);
        client.run();
    }
}
