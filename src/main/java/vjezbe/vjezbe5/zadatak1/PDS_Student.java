package vjezbe.vjezbe5.zadatak1;

public class PDS_Student extends Student{

    public PDS_Student(String name) {
        this.name = name;
    }

    @Override
    protected void completeStudy(int year) {
        System.out.println("This student is on this " + year + ". year of the study and is trying to get bachelor degree");
    }
}
