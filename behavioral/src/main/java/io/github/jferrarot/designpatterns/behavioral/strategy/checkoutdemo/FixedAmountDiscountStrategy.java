package io.github.jferrarot.designpatterns.behavioral.strategy.checkoutdemo;

public class FixedAmountDiscountStrategy implements Strategy {
    private final double amount;

    public FixedAmountDiscountStrategy(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        this.amount = amount;
    }

    @Override
    public double apply(double subtotal) {
        double result = subtotal - amount;
        return Math.max(0, result);
    }
}
