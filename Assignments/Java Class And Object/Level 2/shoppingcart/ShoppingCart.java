package shoppingcart;
import java.util.*;
public class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();
    public void addItem(String itemName, double price, int quantity) {
        items.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to cart.");
    }
    public void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(itemName)) {
                items.remove(i);
                System.out.println(itemName + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in cart.");
        }
    }
    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: ₹" + total);
    }
    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (CartItem item : items) {
                System.out.println(item.itemName + " - ₹" + item.price + " x " + item.quantity + " = ₹" + item.getTotalPrice());
            }
        }
    }
}
