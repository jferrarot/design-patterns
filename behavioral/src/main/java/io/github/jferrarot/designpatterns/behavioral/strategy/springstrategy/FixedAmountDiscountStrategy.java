package io.github.jferrarot.designpatterns.behavioral.strategy.springstrategy;

import org.springframework.stereotype.Component;

@Component("fixed")
public class FixedAmountDiscountStrategy implements DiscountStrategy {
    @Override
    public double apply(double subtotal) {
        return Math.max(0, subtotal-100);
    }
}
