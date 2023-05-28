package school;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Student {
    private String name, surname;
    private LocalDate birthDate;
    private int sciencePoints = 0, lifePoints = 0;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void learn(LocalDate from, LocalDate to){
        int dni = (int) ChronoUnit.DAYS.between(from, to);

        if(dni >= 2){
            sciencePoints = sciencePoints + 5;
        }
    }

    public void party(LocalDate from, LocalDate to){
        int dni = (int) ChronoUnit.DAYS.between(from, to);

        if(dni >= 2){
            lifePoints = lifePoints + 5;
        }
    }

    public boolean isGoodStudent(){
        if(lifePoints == 0 && sciencePoints == 0){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", sciencePoints=" + sciencePoints +
                ", lifePoints=" + lifePoints +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
