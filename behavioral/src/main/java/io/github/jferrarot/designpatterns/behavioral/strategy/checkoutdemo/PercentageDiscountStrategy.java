package io.github.jferrarot.designpatterns.behavioral.strategy.checkoutdemo;

public class PercentageDiscountStrategy implements Strategy {
    private final double percent;

    public PercentageDiscountStrategy(double percent) {
        if(percent < 0 || percent > 100) throw new IllegalArgumentException("Percentage must be between 0 and 100");
        this.percent = percent;
    }


    @Override
    public double apply(double subtotal) {
        return subtotal * (100 - percent) / 100;
    }
}
