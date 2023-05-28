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
        int id = 0;
        for(Student ele: students){
            if(ele.getName().equals(name) && ele.getSurname().equals(sureName)){
                return students.get(id);
            }

            id++;
        }

        return null;
    }

    public boolean removeStudent(String name, String sureName){
        int id = 0;
        for(Student ele: students){
            if(ele.getName().equals(name) && ele.getSurname().equals(sureName)){
                break;
            }

            id++;
        }

        students.remove(id);
        return true;
    }
}
