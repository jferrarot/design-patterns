package io.github.jferrarot.designpatterns.creational.factorymethod.notificationdemo.creator;

import io.github.jferrarot.designpatterns.creational.factorymethod.notificationdemo.product.EmailNotification;
import io.github.jferrarot.designpatterns.creational.factorymethod.notificationdemo.product.Notification;

public class EmailNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
