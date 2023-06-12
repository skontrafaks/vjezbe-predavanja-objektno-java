package vjezbe.vjezbe5.zadatak3;

import java.util.Scanner;

public class TestInner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer("Žarko");
        System.out.println(customer);
        Payment payment1 = new Payment("VISA");
        System.out.println(payment1);

        Package package1 = new Package("SHOP", "Zadar", customer, payment1);
        package1.packageInfo();
        package1.putContent();
        System.out.println("-----------------------------------------");
        package1.packageInfo();
    }
}
