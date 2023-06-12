package stari_ispiti.ispit24_06_2022.zadatak2;

public abstract class Person {

    protected int id;
    protected static int cntID = 0;
    protected String name;

    protected Person(String name) {
        this.id = ++cntID;
        this.name = name;
    }

    public abstract void definePerson();
}
