package stari_ispiti.ispit24_06_2022.zadatak2;

public class Student extends Person{

    private String study;

    protected Student(String name, String study) {
        super(name);
        this.study = study;
    }


    @Override
    public void definePerson() {
        System.out.println("Student " + name + " with ID " + id + " is studying " + study);
    }

    @Override
    public String toString() {
        return "Student{" +
                "study='" + study + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
