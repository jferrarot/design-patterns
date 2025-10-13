package io.github.jferrarot.designpatterns.behavioral.strategy.checkoutdemo;

import java.util.ArrayList;
import java.util.List;

public class CheckoutContext {
    private Strategy discountStrategy;
    private final List<Product> products = new ArrayList<>();

    public CheckoutContext(Strategy initalStrategy) {
        this.discountStrategy = initalStrategy;
    }

    public void setStrategy(Strategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double subtotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public double total() {
        double sub = subtotal();
        return discountStrategy.apply(sub);
    }

    public void clear() {
        products.clear();
    }
}
