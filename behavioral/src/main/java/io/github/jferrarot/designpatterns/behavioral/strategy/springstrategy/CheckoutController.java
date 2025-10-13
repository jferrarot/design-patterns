package io.github.jferrarot.designpatterns.behavioral.strategy.springstrategy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckoutController {

    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @GetMapping("/checkout")
    public String checkout(@RequestParam double subtotal,
                           @RequestParam(defaultValue = "none") String type) {

        double total = checkoutService.calculate(type, subtotal);
        return String.format("Subtotal: $%.2f | Strategy: %s | Total: $%.2f", subtotal, type, total);
    }

}
