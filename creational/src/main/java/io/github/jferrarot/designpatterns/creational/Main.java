package io.github.jferrarot.designpatterns.creational;


import io.github.jferrarot.designpatterns.creational.abstractfactory.reportdemo.ExcelReportFactory;
import io.github.jferrarot.designpatterns.creational.abstractfactory.reportdemo.PDFReportFactory;
import io.github.jferrarot.designpatterns.creational.abstractfactory.reportdemo.ReportFactory;
import io.github.jferrarot.designpatterns.creational.factorymethod.notificationdemo.creator.EmailNotificationFactory;
import io.github.jferrarot.designpatterns.creational.factorymethod.notificationdemo.creator.NotificationFactory;
import io.github.jferrarot.designpatterns.creational.factorymethod.notificationdemo.creator.SMSNotificationFactory;

public class Main {
    static void main() {
        notificationdemo();
        System.out.println("\n");
        reportdemo();
    }

    private static void reportdemo() {
        ReportFactory pdfFactory = new PDFReportFactory();
        ReportFactory excelFactory = new ExcelReportFactory();

        System.out.println("=== PDF Reports ===");
        pdfFactory.createSummaryReport().generate("Sales Q3");
        pdfFactory.createDetailedReport().generate("Sales Q3 Details");

        System.out.println("\n=== Excel Reports ===");
        excelFactory.createSummaryReport().generate("Inventory Summary");
        excelFactory.createDetailedReport().generate("Inventory Details");
    }

    static void notificationdemo() {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        NotificationFactory smsFactory = new SMSNotificationFactory();

        System.out.println("=== Email Notification ===");
        emailFactory.sendNotification("Your order has been shipped!");

        System.out.println("\n=== SMS Notification ===");
        smsFactory.sendNotification("Your OTP is 123456");
    }
}
