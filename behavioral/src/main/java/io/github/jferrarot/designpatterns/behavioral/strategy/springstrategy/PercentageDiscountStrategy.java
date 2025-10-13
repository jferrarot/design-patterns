package io.github.jferrarot.designpatterns.behavioral.strategy.springstrategy;

import org.springframework.stereotype.Component;

@Component("percentage")
public class PercentageDiscountStrategy implements DiscountStrategy {
    @Override
    public double apply(double subtotal) {
        return subtotal * (100 - 90) / 100;
    }
}
