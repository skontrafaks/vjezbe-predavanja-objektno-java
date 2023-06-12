package vjezbe.vjezbe5.zadatak2;

import java.util.UUID;

public class FamousPerson implements CommonActions{

    String name;
    int age;

    public FamousPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void walk(String dir, int meters) {
        System.out.println("I'm a human, and you can't command to me!");
    }

    @Override
    public void talk() {
        System.out.println("You want me to talk - ok:" + UUID.randomUUID().toString());
    }

    @Override
    public void think(String thought) {
        System.out.println("Humans are smarted then robots, right?");
    }

    @Override
    public int calculate(int num) {
        return 5 % 2;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void personInfo() {
        toString();
    }
}
