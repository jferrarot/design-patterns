package io.github.jferrarot.designpatterns.creational.abstractfactory.reportdemo;

public class DetailedReport implements Report {
    private final String format;

    public DetailedReport(String format) {
        this.format = format;
    }

    @Override
    public void generate(String content) {
        System.out.println("Generating " + format + " Detailed Report: " + content);
    }
}
