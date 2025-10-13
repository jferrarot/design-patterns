package io.github.jferrarot.designpatterns.creational.abstractfactory.reportdemo;

public class PDFReportFactory implements ReportFactory {
    @Override
    public Report createSummaryReport() {
        return new SummaryReport("PDF");
    }

    @Override
    public Report createDetailedReport() {
        return new DetailedReport("PDF");
    }
}
