package stari_ispiti.ispit24_06_2022.zadatak3;

public class StreamingService implements Comparable<StreamingService> {
    private int id;
    private static int cntID = 1;
    private double monthlyPrice;
    private String serviceName;

    public StreamingService(double monthlyPrice, String serviceName) {
        this.monthlyPrice = monthlyPrice;
        this.serviceName = serviceName;
        this.id = cntID++;
    }

    public void describeSubscription() {
        System.out.println("Name of the service: " + getServiceName());
        System.out.println("Price of monthly subscribtion: " + getMonthlyPrice());
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public int compareTo(StreamingService o) {
        return Double.compare(this.getMonthlyPrice(), o.getMonthlyPrice());
    }
}
