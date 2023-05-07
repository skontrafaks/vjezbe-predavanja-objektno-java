package vjezbe.vjezbe5.zadatak3;

public class Customer {
    private String name;
    private int id;
    private static int cntID = 145;

    public Customer(String name) {
        this.name = name;
        id = cntID++;
    }

    @Override
    public String toString() {
        return "Customer -> " + name + " id: " + id;
    }

    public void customerInfo() {
        System.out.println(this.toString());
    }
}
