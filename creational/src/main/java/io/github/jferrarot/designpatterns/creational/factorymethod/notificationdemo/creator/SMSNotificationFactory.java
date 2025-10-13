package io.github.jferrarot.designpatterns.creational.factorymethod.notificationdemo.creator;

import io.github.jferrarot.designpatterns.creational.factorymethod.notificationdemo.product.Notification;
import io.github.jferrarot.designpatterns.creational.factorymethod.notificationdemo.product.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
