import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();

        list.add(new Laptop("L1", "MacBook Air", 25000, "Apple"));
        list.add(new Laptop("L2", "ThinkPad X1", 28000, "Lenovo"));
        list.add(new Smartphone("S1", "iPhone 15", 20000, 170));
        list.add(new Smartphone("S2", "Galaxy S24", 22000, 168));
        list.add(new Tablet("T1", "iPad Pro", 18000, 11.0));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}