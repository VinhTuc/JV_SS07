package TongHop;

import TongHop.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//package TongHop;
//
class StudentManagement {
    private final List<Student> students = new ArrayList<>();

    public void showAll() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }

        for (Student student : students) {
            System.out.println("Mã số: " + student.getStudentId() +
                    ", Tên: " + student.getName() +
                    ", Điểm TB: " + student.getAverageScore());
        }
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Đã thêm sinh viên thành công.");
    }

    public void removeStudent(int studentId) {
        students.removeIf(s -> s.getStudentId() == studentId);
        System.out.println("Đã xóa sinh viên thành công.");
    }

    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;

            }
        }
        System.out.println("Không tìm thấy sinh viên.");
        return null;
    }

    public double getAverageScore()
    {
        if (students.isEmpty()) {
            return 0;
        }

        double totalScore = 0;
        for (Student student : students) {
            totalScore += student.getAverageScore();
        }
        return totalScore / students.size();
    }

    public void sortByScore() {
        students.sort(Comparator.comparingDouble(Student::getAverageScore));
        System.out.println("Đã sắp xếp sinh viên theo điểm tăng dần.");
    }
}
