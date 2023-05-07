package vjezbe.vjezbe5.zadatak1;

public class DS_Student extends Student{

    public DS_Student(String name) {
        this.name = name;
    }

    @Override
    protected void completeStudy(int year) {
        System.out.println(this.getClass().getSimpleName() + " is on " + year + ". year of the study");
    }
}
