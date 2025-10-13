package io.github.jferrarot.designpatterns.behavioral.templatemethod.paymentdemo;

public abstract class PaymentProcessor {

    public final void processPayment(double amount) {
        validatePayment(amount);
        applyFees(amount);
        sendReceipt(amount);
    }

    protected abstract void validatePayment(double amount);
    protected abstract void applyFees(double amount);

    private void sendReceipt(double amount) {
        System.out.println("Payment of $" + amount + " processed. Receipt sent.");
    }
}
