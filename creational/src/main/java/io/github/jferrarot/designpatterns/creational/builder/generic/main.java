package io.github.jferrarot.designpatterns.creational.builder.generic;

public class main {
    public static void main(String[] args) {
        GenericPost post = GenericBuilder.of(GenericPost::new)
                .with(GenericPost::setTitle,"Java Title")
                .with(GenericPost::setCategory, "Programming")
                .with(GenericPost::setText, "Explaining")
                .build();
    }
}
