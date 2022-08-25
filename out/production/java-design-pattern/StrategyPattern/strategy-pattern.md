# **Strategy Pattern**

Strategy pattern is one of the `behavioural design pattern`. It is used when we have multiple algorithm for a specific task and client decide the actual implementation to be used at runtime.

It Also known as `Policy Pattern`.

Example: Shopping Cart

Here, Customer adding items in there shopping cart and at the time of payment, s/he decided to choose payment option.
1. Credit / Debit card
2. Paypal

Based on selected payment option, payment has been taken.


__Note: One of the best example of strategy pattern is `Collections.sort()` method that takes Comparator parameter. Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.__
