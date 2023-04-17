package predavanja.predavanja17_4;

import java.util.Objects;

public class TestEQ {

    public static void main(String[] args) {

        String s1 = "Ovo je neki string";
        String s2 = "Ovo je neki string";
        Person p1 = new Person("Ivan");
        Person p2 = new Person("Ivan");

        testEquals(s1, s2);
        testEqualsT(s1, s2);
        testEqualsT(p1, p2);
        p2.setId(100);
        testEqualsT(p1, p2);
    }

    static void testEquals(String s1, String s2){
        System.out.println("S1: " + s1 + " | S2: " + s2);
        System.out.println("Strings are equal by using operator: " + (s1 == s2));
        System.out.println("Strings are equal by using this method: " + s1.equals(s2));
    }

    static <T> void testEqualsT(T ep1,T ep2){
        System.out.println("-----------Generics example------------");
        System.out.println(ep1);
        System.out.println(ep2);
        System.out.println("Person object are equal using operator: " + (ep1 == ep2));
        System.out.println("Person object are equal - equals method: "  + ep1.equals(ep2));
    }

    static class Person{
        String name;
        int id;
        static int cntID = 100;

        public Person(String name){
            this.name = name;
            this.id = cntID++;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            String desc = getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
            return "Person{" +
                    "name='" + name + '\'' +
                    ", id=" + id + '\'' +
                    "hash: " + desc +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return id == person.id && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id);
        }
    }
}
