package io.github.jferrarot.designpatterns.creational.abstractfactory.reportdemo;

public class SummaryReport implements Report {
    private final String format;

    public SummaryReport(String format) {
        this.format = format;
    }

    @Override
    public void generate(String content) {
        System.out.println("Generating " + format + " Summary Report: " + content);
    }
}
