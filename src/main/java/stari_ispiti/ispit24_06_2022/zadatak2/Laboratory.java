package stari_ispiti.ispit24_06_2022.zadatak2;

import java.util.ArrayList;

public class Laboratory {

    private int id;
    private static int cntID = 0;
    private String labName;
    private ArrayList<Person> personel;

    public Laboratory(String labName) {
        this.labName = labName;
        personel = new ArrayList<>();
    }

    public void addPerson(Person person) {
        System.out.println("-------------------------");
        // check is person already in personel
        if (personel.contains(person)) {
            System.out.println("Person " + person + " ALREADY IN PERSONEL -> " + personel);
        } else {
            personel.add(person);
            System.out.println("Person " + person + " added to personel -> " + labName);
        }
    }

    public void listAllPersonel() {
        System.out.println("-------------------------" + labName + "-------------------------");
        System.out.println("Personel of " + labName + " laboratory:");
        for (Person person : personel) {
            person.definePerson();
        }
    }

    public ArrayList<Person> getPersonel() {
        return personel;
    }
}
