package vjezbe.vjezbe5.zadatak3;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Package {

    private int id;
    private static int cntID = 100;
    private String webShop;
    private String destination;
    private Customer customer;
    private float packagePrice;
    private int totalItems;
    private List<Item> items;
    private static final float MINF = 10;
    private static final float MAXF = 150;
    private static final int KOMS = 10;
    private String[] typeItems = {"TShirt", "Sneakers"};
    private Set<Payment> payments;
    private Scanner sc;

    public Package(String webShop, String destination, Customer customer, Payment payment) {
        this.webShop = webShop;
        this.destination = destination;
        this.customer = customer;
        this.id = cntID++;
        this.items = new ArrayList<>();
        this.payments = new HashSet<>();
        this.payments.add(payment);
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public boolean checkPaymentForPackage() {
        boolean status = false;
        System.out.println("enter payment method...");
        String paymentMethod = sc.nextLine();
        for (Payment payment : payments) {
            if (payment.getPayment().equals(paymentMethod)) {
                status = true;
                break;
            }
        }
        return status;
    }

    private float randomItemPrice() {
        return ThreadLocalRandom.current().nextFloat(MINF, MAXF);
    }

    private int randomNumItems() {
        return ThreadLocalRandom.current().nextInt(KOMS);
    }

    public void putContent() {
        int numItems = randomNumItems();
        int[] indx = new int[numItems];
        for (int k = 0; k < numItems; k++) {
            indx[k] = ThreadLocalRandom.current().nextInt(typeItems.length);
        }
        for (int k = 0; k < numItems; k++) {
            if (indx[k] == 0) {
                T_Shirt tshirt = new T_Shirt(randomItemPrice(), randomNumItems());
                items.add(tshirt);
            } else if (indx[k] == 1) {
                Sneakers sneakers = new Sneakers(randomItemPrice(), randomNumItems());
                items.add(sneakers);
            }
        }
        System.out.println("Finished putting content into package...");
        calculateTotalItemsPrice();
        calculateTotalPackageItems();
    }

    public void calculateTotalItemsPrice() {
        for (Item item : items) {
            packagePrice += item.calculatePrice();
        }
    }

    public void calculateTotalPackageItems() {
        for (Item item : items) {
            totalItems += item.getNumItems();
        }
    }

    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", webShop='" + webShop + '\'' +
                ", destination='" + destination + '\'' +
                ", customer=" + customer +
                ", packagePrice=" + packagePrice +
                ", totalItems=" + totalItems +
                ", items=" + items +
                '}';
    }

    public void packageInfo() {
        System.out.println(this);
    }

    class T_Shirt extends Item {

        protected T_Shirt(float itemPrice, int numItems) {
            super(itemPrice, numItems);
        }

        @Override
        protected float calculatePrice() {
            return this.itemPrice*this.numItems;
        }
        @Override
        public String toString() {
            return this.getClass().getSimpleName();
        }
    }

    class Sneakers extends Item {

        protected Sneakers(float itemPrice, int numItems) {
            super(itemPrice, numItems);
        }

        @Override
        protected float calculatePrice() {
            return this.itemPrice*this.numItems*0.9f;
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName();
        }
    }
}
