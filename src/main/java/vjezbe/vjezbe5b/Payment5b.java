package vjezbe.vjezbe5b;

public class Payment5b {

    private String paymentType;

    public Payment5b(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return paymentType;
    }
}
