package io.github.jferrarot.designpatterns.creational.builder.generic;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public record GenericBuilder<T>(Supplier<T> supplier) {

    public static <T> GenericBuilder<T> of(Supplier<T> supplier) {
        return new GenericBuilder<>(supplier);
    }

    public <P> GenericBuilder<T> with(BiConsumer<T, P> consumer, P value) {
        return new GenericBuilder<>(() -> {
            T object = supplier.get();
            consumer.accept(object, value);
            return object;
        });
    }

    public T build() {
        return supplier.get();
    }
}
