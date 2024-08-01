package TongHop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
    private int studentId;
    private String name;
    private double averageScore;

    // Constructor
    public Student(int studentId, String name, double averageScore) {
        this.studentId = studentId;
        this.name = name;
        this.averageScore = averageScore;

    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public
    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore
 = averageScore;
    }
}