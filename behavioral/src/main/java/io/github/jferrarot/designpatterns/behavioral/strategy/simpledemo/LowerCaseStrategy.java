package io.github.jferrarot.designpatterns.behavioral.strategy.simpledemo;

public class LowerCaseStrategy implements CasingStrategy {
    @Override
    public String transform(String input) {
        return input == null ? "" : input.toLowerCase();
    }
}
