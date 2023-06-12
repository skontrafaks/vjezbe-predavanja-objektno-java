package vjezbe.vjezbe5b;

public class Customer5b {

    private Payment5b customerPayment;
    private String name;
    private String location;

    public Customer5b(Payment5b customerPayment, String name, String location) {
        this.customerPayment = customerPayment;
        this.name = name;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public Payment5b getCustomerPayment() {
        return customerPayment;
    }

    @Override
    public String toString() {
        return name;
    }
}
