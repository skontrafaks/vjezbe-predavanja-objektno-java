package stari_ispiti.ispit24_06_2022.zadatak3;

public class GoogleWallet implements PaymentMethod{


    @Override
    public void performPayment(Double price) {
        System.out.println();
        System.out.println("Performing payment...");
        System.out.println("Amount: " + price);
        System.out.println("Payed by: " + getClass().getSimpleName());
    }
}
