# Template Method Pattern — Payment Demo

This project demonstrates the **Template Method Design Pattern** using a simple **Java business example**.

## Concept

The Template Method defines the **skeleton of an algorithm** in an abstract class, deferring some steps to subclasses.  
Subclasses implement specific steps without changing the overall workflow.

## Business Example: Payment Processing

Different payment types follow the same overall process:

1. Validate payment
2. Apply fees
3. Send receipt

Concrete subclasses implement the specific validation and fee calculation.

### Classes

- `PaymentProcessor` — abstract template defining the workflow
- `CreditCardPayment` — validates credit card payments and applies a 2% fee
- `PaypalPayment` — validates PayPal payments and applies a fixed $1 fee
