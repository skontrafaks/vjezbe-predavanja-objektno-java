package stari_ispiti.ispit24_06_2022.zadatak3;

public class AppTest {

    public static void main(String[] args) {
        User user1 = new User("Radovan");
        PaymentMethod pm1 = new GoogleWallet();
        StreamingApplication streamingApplication = new StreamingApplication(user1);
        streamingApplication.setPaymentMethod(pm1);
        streamingApplication.subscribeToService(new StreamingService(
                20, "netflix"), 4);
        streamingApplication.subscribeToService(new StreamingService(
                10, "hbo"), 5);
        streamingApplication.subscribeToService(new StreamingService(
                15, "SuperSport"), 3);
        streamingApplication.subscribtionStatus();

        streamingApplication.subscribeToService(new StreamingService(
                15, "SuperSport"), 3);

    }
}
