package school;

import java.util.ArrayList;
import java.util.List;

public class University {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(){
        students.add(new Student("Mateusz", "Maniak"));
        students.add(new Student("Mateusz1", "Maniak1"));
        students.add(new Student("Mateusz2", "Maniak2"));
    }

    public Student getStudent(String name, String sureName){
        return students.get(1);
    }

    public boolean removeStudent(String name, String sureName){
        students.remove(0);
        return true;
    }
}
