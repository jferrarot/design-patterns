# Spring Boot Strategy Example

## Overview

This module demonstrates the **Strategy Design Pattern** implemented using **Spring Boot**.

Instead of manually wiring strategies in code, Spring automatically detects and injects all `DiscountStrategy` beans.
The controller can then pick one dynamically at runtime.

---

## 💡 Key idea

The Strategy Pattern encapsulates interchangeable algorithms (in this case, discount rules) behind a common interface.

In Spring, each algorithm is a separate `@Component` implementing `DiscountStrategy`.

---

## ⚙️ Components

| Class | Responsibility |
|--------|----------------|
| `DiscountStrategy` | Strategy interface for all discount types |
| `NoDiscountStrategy` | Returns subtotal unchanged |
| `PercentageDiscountStrategy` | Applies 10% off |
| `FixedAmountDiscountStrategy` | Applies $100 off |
| `CheckoutService` | Context — receives all strategies as beans and picks the right one |
| `CheckoutController` | REST endpoint exposing `/checkout` for testing |
| `SpringStrategyApplication` | Spring Boot entry point |

---

## 🧠 How Spring applies Strategy pattern

- Each strategy is annotated with `@Component("beanName")`.
- Spring auto-registers all beans implementing `DiscountStrategy`.
- The `CheckoutService` receives a `Map<String, DiscountStrategy>` where the key is the bean name.
- The right strategy is picked at runtime using that map.

This is a **pure Strategy pattern**, made declarative thanks to **Spring Dependency Injection**.

---

## 🧪 Example calls

### No discount
