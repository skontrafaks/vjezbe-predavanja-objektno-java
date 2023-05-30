package stari_ispiti.ispit8_7_2022.zadatak1;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private int student_id;
    private String student_name;
    private String university;
    private String[] courses;

    public Student(int student_id, String student_name, String university, String[] courses) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.university = university;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", university='" + university + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
