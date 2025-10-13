# Abstract Factory Pattern — Report Generator

This project demonstrates the **Abstract Factory Design Pattern** using a **business example**.

## Concept

The Abstract Factory provides an **interface for creating families of related objects** without specifying their concrete classes.  
It ensures that the products created are **compatible with each other**.

## Business Example: Report Generation

Different formats (PDF, Excel) and types (Summary, Detailed) of reports:

- `Report` — product interface
- `SummaryReport` / `DetailedReport` — concrete products
- `ReportFactory` — abstract factory
- `PDFReportFactory` / `ExcelReportFactory` — concrete factories
