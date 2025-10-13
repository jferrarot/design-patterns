package io.github.jferrarot.designpatterns.behavioral.templatemethod.paymentdemo;

public class CreditCardPayment extends PaymentProcessor {

    @Override
    protected void validatePayment(double amount) {
        System.out.println("Validating credit card payment...");
    }

    @Override
    protected void applyFees(double amount) {
        System.out.println("Applying 2% credit card fee: $" + (amount * 0.02));
    }
}
