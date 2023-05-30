package stari_ispiti.ispit24_06_2022.zadatak1;

public class Test {

    public static void main(String[] args) {
        String filePath = "src\\stari_ispiti\\ispit24_06_2022\\zadatak1\\data.csv";
        try {
            AUXCLS.readDataFromCSVFile(filePath);
            AUXCLS.printData();
            AUXCLS.passedExams();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
