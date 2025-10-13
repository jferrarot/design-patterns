package io.github.jferrarot.designpatterns.behavioral.strategy.checkoutdemo;

public class NoDiscountStrategy implements Strategy {
    @Override
    public double apply(double subtotal) {
        return subtotal;
    }
}
