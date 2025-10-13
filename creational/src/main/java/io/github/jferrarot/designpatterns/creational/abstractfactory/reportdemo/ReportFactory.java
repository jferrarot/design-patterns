package io.github.jferrarot.designpatterns.creational.abstractfactory.reportdemo;

public interface ReportFactory {
    Report createSummaryReport();
    Report createDetailedReport();
}
