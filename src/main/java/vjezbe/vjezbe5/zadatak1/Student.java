package vjezbe.vjezbe5.zadatak1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Student {

    private static final DateFormat DATE_FORMAT =
            new SimpleDateFormat("dd-MM-yyyy");
    protected Date enrolmentDate;
    protected String name;

    protected void setEnrolmentDate() throws ParseException {
        System.out.println("----------------------------------------");
        System.out.println("Please type date in format dd-MM-yyyy:\n");
        Scanner scn = new Scanner(System.in);
        String our_date = scn.nextLine();
        enrolmentDate = DATE_FORMAT.parse(our_date);
    }

    protected void infoStudent() {
        System.out.println("Student ->" + name);
        System.out.println("Enroled -> " + enrolmentDate);
        System.out.println("This student is on: " + this.getClass().getSimpleName());
    }

    protected abstract void completeStudy(int year); // method that we will implement later in different ways
}
