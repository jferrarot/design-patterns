# Strategy Pattern Module

This module contains two Strategy examples:

1. **Business example (Checkout/Discount strategies)** - `CheckoutDemo`  
   Demonstrates a realistic use-case where different discount rules are applied at runtime:
    - `PercentageDiscountStrategy` - percent based discount (e.g. 10% off)
    - `FixedAmountDiscountStrategy` - fixed money-off coupon (e.g. $200 off)
    - `NoDiscountStrategy` - no discount

2. **Simple example** - `SimpleDemo`  
   Tiny example showing string transformation strategies:
    - `UpperCaseStrategy`
    - `LowerCaseStrategy`

---

## Why Strategy?

The Strategy Pattern:
- Encapsulates algorithms (or policies) into separate classes.
- Lets clients choose algorithm at runtime.
- Keeps the context class (e.g., `CheckoutContext`) free from algorithm-specific code.
- Makes algorithms testable and easily extensible.

---

## When to use

Use Strategy when:
- You have multiple ways to perform an operation and want to switch among them at runtime.
- You want to avoid conditional logic (if/else or switch) spread through your code for different behaviors.
- You want to make behaviors pluggable, testable, or configurable.

---

## Structure (important classes)

- `Strategy` — interface for discount calculation.
- Concrete implementations: `PercentageDiscountStrategy`, `FixedAmountDiscountStrategy`, `NoDiscountStrategy`.
- `CheckoutContext` — holds items and applies the configured strategy.
- `CheckoutDemo` — runnable example simulating checkout flows.

Simple example:
- `CasingStrategy` — transforms text.
- `UpperCaseStrategy`, `LowerCaseStrategy` — concrete strategies.
- `SimpleDemo` — runnable small example.

---

## How to run

From the repository root (assuming a Gradle wrapper exists):

- Run the **business demo** (default main):
```bash
./gradlew :strategy:run