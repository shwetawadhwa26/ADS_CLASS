
import java.util.ArrayList;

class Student {

    private int studentNumber;
    private String studentName;
    private String degree;

    public Student(int num, String name, String deg) {
        studentNumber = num;
        studentName = name;
        degree = deg;
    }

    public void details() {
        System.out.println("Student number " + studentNumber);
        System.out.println("Student name " + studentName);
    }

    public void qualification() {
        System.out.println("Degree " + degree);
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        Student student1 = new Student(1, "Anushka", "B.Tech");
        Student student2 = new Student(2, "Shweta", "B.Tech");

        studentList.add(student1);
        studentList.add(student2);

        for (Student student : studentList) {
            student.details();
            student.qualification();
        }
    }
}
