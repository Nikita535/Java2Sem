package ru.mirea.Pract_14;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String getUniversityName() {
        return name;
    }

    public void setUniversityName(String groupName) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
