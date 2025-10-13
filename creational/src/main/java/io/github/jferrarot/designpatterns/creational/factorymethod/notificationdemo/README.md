# Factory Method Pattern — Notification Demo

This project demonstrates the **Factory Method Design Pattern** using a simple **Java business example**.

## Concept

The Factory Method defines an **interface for creating objects** but lets subclasses decide which class to instantiate.  
This allows a class to defer instantiation to subclasses.

## Business Example: Notification System

Different notification types (Email, SMS) follow the same interface:

- `Notification` — product interface
- `EmailNotification` — concrete product
- `SMSNotification` — concrete product
- `NotificationFactory` — abstract creator
- `EmailNotificationFactory` / `SMSNotificationFactory` — concrete creators
