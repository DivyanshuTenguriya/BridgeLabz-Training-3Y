package shoppingcart;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 50000, 1);
        cart.addItem("Headphones", 2000, 2);
        cart.displayCart();
        cart.displayTotalCost();

        cart.removeItem("Headphones");
        cart.displayCart();
        cart.displayTotalCost();

        cart.removeItem("Phone");
    }
}
