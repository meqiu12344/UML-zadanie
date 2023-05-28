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

        System.out.println(university.getStudent("Mateusz1", "Maniak1"));
        university.removeStudent("Mateusz1", "Maniak1");

        System.out.println("Good student: " + student.isGoodStudent());

        System.out.println(university.getStudent("Mateusz", "Maniak"));
    }
}