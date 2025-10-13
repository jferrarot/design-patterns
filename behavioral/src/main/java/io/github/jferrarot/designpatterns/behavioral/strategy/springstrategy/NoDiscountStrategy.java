package io.github.jferrarot.designpatterns.behavioral.strategy.springstrategy;

import org.springframework.stereotype.Component;

@Component("none")
public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public double apply(double subtotal) {
        return subtotal;
    }
}
