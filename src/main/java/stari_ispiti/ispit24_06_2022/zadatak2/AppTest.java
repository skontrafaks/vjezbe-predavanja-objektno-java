package stari_ispiti.ispit24_06_2022.zadatak2;

import java.util.ArrayList;

public class AppTest {

    public static void main(String[] args) {
        Laboratory lab1 = new Laboratory("Future lab");
        Laboratory lab2 = new Laboratory("AI lab");

        Professor prof1 = new Professor("John", "Computer Science");
        Professor prof2 = new Professor("Jane", "Mathematics");
        Student stud1 = new Student("Jack", "Rocket Science");
        Student stud2 = new Student("Jill", "Earth exploration");
        LabAssistant ass1 = new LabAssistant("James", "AI");

        lab1.addPerson(prof1);
        lab1.addPerson(stud1);
        lab1.addPerson(ass1);

        lab2.addPerson(prof2);
        lab2.addPerson(stud2);
        lab2.addPerson(ass1);

        getAllStaff(lab1, lab2);
        lab1.addPerson(prof1);

        Professor prof3 = new Professor("Ivan", "Biology");
        lab1.addPerson(prof3);
        lab2.addPerson(prof3);

        getSharedStaff(lab1.getPersonel(), lab2.getPersonel());

    }

    public static void getAllStaff(Laboratory lab1, Laboratory lab2) {
        lab1.listAllPersonel();
        lab2.listAllPersonel();
    }

    public static void getSharedStaff(ArrayList<Person> lab1Personel, ArrayList<Person> lab2Personel) {
        System.out.println("-------------------------" + "Shared staff" + "-------------------------");
        for (Person person : lab1Personel) {
            if (lab2Personel.contains(person)) {
                System.out.println("Person " + person + " is in both labs");
            }
        }
    }
}
