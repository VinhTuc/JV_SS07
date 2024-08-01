package TongHop;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();

        //Thêm sinh viên
        StudentManagement studentManagement = null;
        studentManagement.addStudent(newStudent(1, "Nguyễn Văn A", 8.5));
        studentManagement.addStudent(newStudent(2, "Trần Thị B", 7.2));
    }

    private static Student newStudent(int i, String nguyễnVănA, double v) {
        return null;
    };

    // Tìm kiếm sinh viên
    Student foundStudent = studentManagement.findStudentById(1);
    if (foundStudent != null) {
        System.out.println("Tìm thấy sinh viên: " + foundStudent.getName());
    }

    // Xóa sinh viên
    studentManagement.removeStudent(2);

    // Tính điểm trung bình
    double averageScore = studentManagement.getAverageScore();
    System.out.println("Điểm trung bình: " + averageScore);

    // Sắp xếp
    studentManagement.sortByScore();
    System.out.println("Danh sách sau khi sắp xếp:");
    studentManagement.showAll();
    //Hiển thị danh sách
    studentManagement.showAll();

    private StudentManagement studentManagement;
    // Tìm kiếm sinh viên
    Student foundStudent = studentManagement.findStudentById(1);
    if (foundStudent != null) {
        System.out.println("Tìm thấy sinh viên: " + foundStudent.getName());
    }

    // Xóa sinh viên
    studentManagement.removeStudent(2);

    // Tính điểm trung bình
    double averageScore = studentManagement.getAverageScore();
    System.out.println("Điểm trung bình: " + averageScore);

    // Sắp xếp
    studentManagement.sortByScore();
    System.out.println("Danh sách sau khi sắp xếp:");
    studentManagement.showAll();
}
