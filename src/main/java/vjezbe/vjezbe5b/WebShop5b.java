package vjezbe.vjezbe5b;

public class WebShop5b {

    private String webLocation;
    private Customer5b customer;
    private Order order;
    private Payment5b shopPayment;

    public WebShop5b(String webLocation, Customer5b customer, Order order, Payment5b shopPayment) {
        this.webLocation = webLocation;
        this.customer = customer;
        this.order = order;
        this.shopPayment = shopPayment;
    }

    public void orderContentFromShop() {
        if (shopPayment.equals(customer.getCustomerPayment())) {
            System.out.println("Succefully ordered!");
            System.out.println("Package is flying from " + webLocation + " to " + customer.getLocation());
            order.showContentInOrder();
        } else {
            System.out.println("Payment failed, card required is: " + shopPayment);
        }
    }
}
