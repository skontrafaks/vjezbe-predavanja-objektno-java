package vjezbe.vjezbe5.zadatak1;

import java.text.ParseException;

public class Client {

    public static void main(String[] args) throws ParseException {
        DS_Student dado = new DS_Student("Dado");
        dado.setEnrolmentDate();
        dado.completeStudy(3);
        dado.infoStudent();

        PDS_Student maki = new PDS_Student("Marko");
        maki.setEnrolmentDate();
        maki.completeStudy(4);
        maki.infoStudent();
    }
}
