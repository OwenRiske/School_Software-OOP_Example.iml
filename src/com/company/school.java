//Owen Riske

package com.company;

import java.util.ArrayList;

public class school {
    private ArrayList students;
    ArrayList teachers;
    String name;

    school(String name, ArrayList teachers,ArrayList students){
        this.name=name;
        this.teachers=teachers;
        this.students=students;
    }


    void removeStudent(String student){
        students.remove(student);
    }
    void addStudent(String student){
        students.add(student);
    }
    void removeTeacher(String teacher){
        teachers.remove(teacher);
    }
    void addTeacher(String teacher){
        teachers.add(teacher);
    }

    ArrayList getTeachers(){
        return teachers;
    }
    void setTeachers(ArrayList teachers){
        this.teachers=teachers;
    }
    ArrayList getStudents(){
        return students;
    }
    void setStudents(ArrayList students){
        this.students=students;
    }

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }

    void listStudents(){
        for (Object student:students) {
            System.out.println(student);
        }
    }
    void listTeachers(){
        for (Object teacher:teachers) {
            System.out.println(teacher);
        }
    }

    void editStudent(String student){
        removeStudent(student);
        addStudent(student);
    }
}
