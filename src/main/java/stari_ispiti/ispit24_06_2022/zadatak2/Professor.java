package stari_ispiti.ispit24_06_2022.zadatak2;

public class Professor extends Person {

    private String phdIn;

    protected Professor(String name, String phdIn) {
        super(name);
        this.phdIn = phdIn;
    }

    @Override
    public void definePerson() {
        System.out.println("Professor " + name + " with ID " + id + " has PhD in " + phdIn);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "phdIn='" + phdIn + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
