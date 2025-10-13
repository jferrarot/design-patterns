package io.github.jferrarot.designpatterns.behavioral.templatemethod.paymentdemo;

public class PaypalPayment extends PaymentProcessor {
    @Override
    protected void validatePayment(double amount) {
        System.out.println("Validating PayPal account...");
    }

    @Override
    protected void applyFees(double amount) {
        System.out.println("Applying $1 fixed PayPal fee");
    }
}
