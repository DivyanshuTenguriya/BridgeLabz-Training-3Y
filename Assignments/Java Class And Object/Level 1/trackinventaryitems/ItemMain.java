package trackinventaryitems;

public class ItemMain {
    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 55000);
        item1.displayItem();
        System.out.println("Total Cost (for 2 units): " + item1.calculateTotalCost(2));

    }
}
