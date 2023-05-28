import school.Student;
import school.University;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Mateusz", "Maniak");
        University university = new University();

        student.learn(LocalDate.of(2023, 05, 28), LocalDate.of(2023, 05, 30));
        student.party(LocalDate.of(2023, 05, 28), LocalDate.of(2023, 05, 30));

        university.addStudent();

        System.out.println(university.getStudent("Mateusz", "Maniak").toString());
        university.removeStudent("Mateusz", "Maniak");

        System.out.println("Good student: " + student.isGoodStudent());
    }
}