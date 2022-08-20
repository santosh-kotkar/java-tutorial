package StrategyPattern;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("A123", 100));
        shoppingCart.addItem(new Item("A323", 150));
        shoppingCart.addItem(new Item("A209", 59));
        shoppingCart.pay(new CreditCardPaymentStrategy("Santosh", "0123012301230123", "1234", "12/22"));
        shoppingCart.pay(new PayPalPaymentStrategy("myEmail@gmail.com", "pwd"));
    }
}
