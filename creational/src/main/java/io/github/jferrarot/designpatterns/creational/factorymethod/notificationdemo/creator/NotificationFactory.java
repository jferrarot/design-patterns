package io.github.jferrarot.designpatterns.creational.factorymethod.notificationdemo.creator;

import io.github.jferrarot.designpatterns.creational.factorymethod.notificationdemo.product.Notification;

public abstract class NotificationFactory {

    // Factory method
    public abstract Notification createNotification();

    // Template method (optional)
    public void sendNotification(String message) {
        Notification notification = createNotification();
        notification.notify(message);
    }
}
