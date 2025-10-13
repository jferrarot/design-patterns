package io.github.jferrarot.designpatterns.behavioral.strategy.checkoutdemo;

public interface Strategy {
    /**
    * Calculate final price given a subtotal
    * @param subtotal the original price before discount
    * @return price after applying strategy
    * */
    double apply(double subtotal);
}
