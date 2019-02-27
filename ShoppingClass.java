package exercise;

public class ShoppingClass {

    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();

        item1.desc = "Shirt";
        item2.desc = "Pants";

        item1 = item2;
        System.out.println("Item1: " + item1.desc);
        System.out.println("Item2: " + item2.desc);
    }
}
