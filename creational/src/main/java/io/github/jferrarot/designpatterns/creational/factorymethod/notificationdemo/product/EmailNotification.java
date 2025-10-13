package io.github.jferrarot.designpatterns.creational.factorymethod.notificationdemo.product;

public class EmailNotification implements Notification {
    @Override
    public void notify(String message) {
        System.out.println("Sending EMAIL notification: " + message);
    }
}
