package io.github.jferrarot.designpatterns.behavioral.strategy.springstrategy;

public interface DiscountStrategy {
    double apply(double subtotal);
}
