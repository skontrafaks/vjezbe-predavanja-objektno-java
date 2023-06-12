package predavanja.predavanja20_3treci;

import predavanja.predavanja20_3.User;

import java.util.Arrays;

public class NizoviTest1 {

    public static void main(String[] args) {
        int[] niz1 = new int[10];
        float[] niz2 = new float[5];
        int[] niz3 = {1, 2, 3, 4, 5, 45, 213, 8, 9, 10};
        User[] users = new User[3];
        printElements(niz3);
        printElements(niz2);
        System.out.println(Arrays.toString(users));
        System.out.println(users);
        users[1] = new User("Pera", "Peric");
        users[0] = new User();
        System.out.println(Arrays.toString(users));
        System.out.println(users);
    }

    private static void printElements(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.println("element:" + ar[i]);
        }
    }

    private static void printElements(float[] flAr){
        for (int i = 0; i < flAr.length; i++) {
            System.out.println("element:" + flAr[i]);
        }
    }
}
