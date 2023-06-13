package vjezbe.vjezbe9.zadatak4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CSVDataExtractor {
    public static void main(String[] args) {
        List<String[]> allRows = extractDataFromCSV("src/main/java/vjezbe/vjezbe9/zadatak4/randomData.csv");

        for (String[] row : allRows) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        List<String> firstColumn = extractFirstColumn(allRows);
        System.out.println(firstColumn);
        Set<String> uniqueStudents = getUniqueStudents(allRows);
        System.out.println(uniqueStudents);

        for (String student : uniqueStudents) {
            List<String[]> studentRows = findRowsByStudent(allRows, student);
            StudentData studentData = createStudentData(student, studentRows);
            // Store studentData in the appropriate structure
        }
    }

    private static List<String[]> extractDataFromCSV(String filePath) {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                rows.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rows;
    }

    private static List<String> extractFirstColumn(List<String[]> rows) {
        List<String> firstColumn = new ArrayList<>();
        for (String[] row : rows) {
            if (row.length > 0) {
                firstColumn.add(row[0]);
            }
        }
        return firstColumn;
    }

    private static Set<String> getUniqueStudents(List<String[]> rows) {
        Set<String> uniqueStudents = new HashSet<>();
        for (String[] row : rows) {
            if (row.length > 0) {
                uniqueStudents.add(row[0]);
            }
        }
        return uniqueStudents;
    }

    private static List<String[]> findRowsByStudent(List<String[]> rows, String student) {
        List<String[]> studentRows = new ArrayList<>();
        for (String[] row : rows) {
            if (row.length > 0 && row[0].equals(student)) {
                studentRows.add(row);
            }
        }
        return studentRows;
    }

    private static StudentData createStudentData(String student, List<String[]> studentRows) {
        return new StudentData(student, studentRows);
    }
}

class StudentData {
    private String student;
    private List<String[]> rows;

    public StudentData(String student, List<String[]> rows) {
        this.student = student;
        this.rows = rows;
    }
}
