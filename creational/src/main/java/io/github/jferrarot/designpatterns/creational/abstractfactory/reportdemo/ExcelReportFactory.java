package io.github.jferrarot.designpatterns.creational.abstractfactory.reportdemo;

public class ExcelReportFactory implements ReportFactory {
    @Override
    public Report createSummaryReport() {
        return new SummaryReport("Excel");
    }

    @Override
    public Report createDetailedReport() {
        return new DetailedReport("Excel");
    }
}
