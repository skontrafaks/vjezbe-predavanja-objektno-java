package stari_ispiti.ispit24_06_2022.zadatak3;

import java.util.TreeMap;

public class StreamingApplication {

    private User appUser;
    private TreeMap<StreamingService,Boolean> services;
    private PaymentMethod paymentMethod;

    public StreamingApplication(User appUser) {
        this.appUser = appUser;
        services = new TreeMap<>();
        paymentMethod = null;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void subscribeToService(StreamingService service, int monthsSubscribed) {
        if (paymentMethod == null) {
                System.out.println("Can't perform payment, first choose...");
        } else if(services.containsKey(service)) {
            System.out.println("Already subscribed you fool");
        } else {
            System.out.println("\nSubscribing to: " + service.getServiceName());
            System.out.println("Payment for service: " + service.getMonthlyPrice());
            paymentMethod.performPayment(monthsSubscribed * service.getMonthlyPrice());
            System.out.println("Subscribed for " + monthsSubscribed + " months.");
            services.put(service, true);
        }
    }

    public void subscribtionStatus() {
        System.out.println("\n-----Subscription status-----");
        services.forEach((key, value) -> {
            System.out.println("Service: " + key.getServiceName());
            System.out.println("Subscribtion valid: " + value);
        });
        System.out.println("\n-----------------------------");
    }

    @Override
    public String toString() {
        return "StreamingApplication{" +
                "appUser=" + appUser +
                ", services=" + services +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
