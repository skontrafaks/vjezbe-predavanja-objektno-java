package vjezbe.vjezbe5b;

import java.util.ArrayList;

public class Order {

    private float totalOrderCost;
    private int orderID;
    private static int cntID = 100;
    private ArrayList<Item5b> contentInOrder = new ArrayList<>();
    private String orderDescription;

    public Order(String orderDescription) {
        this.orderDescription = orderDescription;
        this.orderID = cntID++;
    }
    
    public void showContentInOrder() {
        System.out.println("\n----------------------------------------------");
        for (Item5b item : contentInOrder) {
            System.out.println(item);
            System.out.println();
        }
        System.out.printf("Ukupna cijena narudžbe je: %.1f $\n", totalOrderCost);
        System.out.println("----------------------------------------------\n");
    }

    public void addJacketsToOrder(int numOfJackets) {
        Jacket jacket = new Jacket(numOfJackets, "DEER LEATHER JACKET");
        contentInOrder.add(jacket);
        jacket.calculateTotalPrice();
        totalOrderCost += jacket.getTotalPrice();
    }

    public void addSocksToOrder(int numOfSocks) {
        Socks socks = new Socks(numOfSocks, "BLUE COTTON SOCKS");
        contentInOrder.add(socks);
        socks.calculateTotalPrice();
        totalOrderCost += socks.getTotalPrice();
    }

    public void addSweatPantsToOrder(int numOfSP) {
        SweatPants sweatPants = new SweatPants(numOfSP, "ADIDAS SWEATPANTS");
        contentInOrder.add(sweatPants);
        sweatPants.calculateTotalPrice();
        totalOrderCost += sweatPants.getTotalPrice();
    }

    @Override
    public String toString() {
        System.out.println("Order desc: " + orderDescription);
        showContentInOrder();
        return null;
    }

    class Jacket extends Item5b {

        public Jacket(int quantity, String itemDescription) {
            super(quantity, itemDescription);
            itemPrice = 99.9f;
        }
    }

    class Socks extends Item5b {

        public Socks(int quantity, String itemDescription) {
            super(quantity, itemDescription);
            itemPrice = 9.9f;
        }
    }

    class SweatPants extends Item5b {

        public SweatPants(int quantity, String itemDescription) {
            super(quantity, itemDescription);
            itemPrice = 29.9f;
        }
    }
}
