package vjezbe.vjezbe5.zadatak3;

public class Payment {

    private String payment;

    public Payment(String payment) {
        this.payment = payment;
    }

    public String getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "payment='" + payment + '\'' +
                '}';
    }
}
