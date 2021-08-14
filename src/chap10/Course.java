package chap10;

import java.util.Arrays;

public class Course {
    private String courseName;
    String[] students = new String[100];
    int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        numberOfStudents = 0;
    }

    public void dropStudent(String studentName) {
        // sort and binary search cannot perform on null elements
        Arrays.sort(students, 0, numberOfStudents);
        int idx = Arrays.binarySearch(students, 0, numberOfStudents, studentName);
        students[idx] = students[numberOfStudents - 1];
        --numberOfStudents;
    }

    public void addStudent(String studentName) {
        students[numberOfStudents] = studentName;
        ++numberOfStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String[] getStudents() {
        return students;
    }
}
