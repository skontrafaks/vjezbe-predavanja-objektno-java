package vjezbe.vjezbe5b;

public class TestWebShop {

    public static void main(String[] args) {
        //Testing order
        Order order = new Order("Kupovina 5/9/2023");
        order.addJacketsToOrder(6);
        order.addSocksToOrder(23);
        order.addSweatPantsToOrder(9);

        //testing successfull order
        Payment5b payment = new Payment5b("VISA");
        Customer5b firstCustomer = new Customer5b(payment, "Tomica", "Zadar");
        WebShop5b zara = new WebShop5b("New York", firstCustomer, order, payment);
        zara.orderContentFromShop();

        System.out.println("\n\n\nTrying to order with different payment type then the shop accepts...");
        //testing failed order
        WebShop5b pullnbear = new WebShop5b("Moskow", firstCustomer, order, new Payment5b("MAESTROCARD"));
        pullnbear.orderContentFromShop();

    }
}
