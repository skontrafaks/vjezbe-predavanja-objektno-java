package stari_ispiti.ispit24_06_2022.zadatak2;

public class LabAssistant extends Person {

    private String specialization;

    protected LabAssistant(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }


    @Override
    public void definePerson() {
        System.out.println("Lab assistant " + name + " with ID " + id + " is specialized in " + specialization);
    }

    @Override
    public String toString() {
        return "LabAssistant{" +
                "specialization='" + specialization + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
