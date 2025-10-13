package io.github.jferrarot.designpatterns.behavioral.strategy.springstrategy;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CheckoutService {

    private final Map<String, DiscountStrategy> discountStrategies;

    public CheckoutService(Map<String, DiscountStrategy> discountStrategies) {
        this.discountStrategies = discountStrategies;
    }

    public double calculate(String type, double subtotal) {
        DiscountStrategy discountStrategy = discountStrategies.getOrDefault(type, discountStrategies.get("none"));
        return discountStrategy.apply(subtotal);
    }

    public Map<String, DiscountStrategy> availableDiscountStrategies() {
        return discountStrategies;
    }

}
