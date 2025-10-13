package io.github.jferrarot.designpatterns.behavioral;


import io.github.jferrarot.designpatterns.behavioral.strategy.checkoutdemo.*;
import io.github.jferrarot.designpatterns.behavioral.strategy.simpledemo.CasingStrategy;
import io.github.jferrarot.designpatterns.behavioral.strategy.simpledemo.LowerCaseStrategy;
import io.github.jferrarot.designpatterns.behavioral.strategy.simpledemo.UpperCaseStrategy;
import io.github.jferrarot.designpatterns.behavioral.templatemethod.paymentdemo.CreditCardPayment;
import io.github.jferrarot.designpatterns.behavioral.templatemethod.paymentdemo.PaymentProcessor;
import io.github.jferrarot.designpatterns.behavioral.templatemethod.paymentdemo.PaypalPayment;

public class Main {
    static void main() {
        casingDemo();
        checkoutDemo();
        paymentDemo();
    }

    static void paymentDemo() {
        PaymentProcessor creditCard = new CreditCardPayment();
        PaymentProcessor paypal = new PaypalPayment();

        System.out.println("=== Credit Card Payment ===");
        creditCard.processPayment(1000);

        System.out.println("\n=== PayPal Payment ===");
        paypal.processPayment(1000);
    }

    static void casingDemo() {
        CasingStrategy s = new UpperCaseStrategy();
        System.out.println(s.transform("Probando mensaje"));

        s = new LowerCaseStrategy();
        System.out.println(s.transform("Probando mensaje"));
    }

    static void checkoutDemo(){
        System.out.println("STRATEGY DEMO");

        Product p1 = new Product("Laptop", 1500.00);
        Product p2 = new Product("Mouse", 25.00);
        Product p3 = new Product("Tablet", 300.00);
        Product p4 = new Product("Keyboard", 75.00);

        CheckoutContext checkoutContext = new CheckoutContext(new NoDiscountStrategy());
        checkoutContext.addProduct(p1);
        checkoutContext.addProduct(p2);
        checkoutContext.addProduct(p3);
        checkoutContext.addProduct(p4);

        System.out.printf("Subtotal: $%.2f%n", checkoutContext.subtotal());
        System.out.printf("No discount total: $%.2f%n", checkoutContext.total());

        System.out.println("Applying percentage discount");
        checkoutContext.setStrategy(new PercentageDiscountStrategy(10));
        System.out.printf("10%% off total: $%.2f%n", checkoutContext.total());

        System.out.println("Applying fixed amount discount");
        checkoutContext.setStrategy(new FixedAmountDiscountStrategy(200));
        System.out.printf("$200 off coupon total: $%.2f%n", checkoutContext.total());

    }
}
