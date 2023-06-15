//Owen Riske

package com.company;

import java.util.ArrayList;

public class teacher {
    String name;
    ArrayList subjects;
    private double salary;
    String education;

    teacher(String name, ArrayList subjects, double salary, String education){
        this.name=name;
        this.subjects=subjects;
        this.salary=salary;
        this.education=education;
    }

    void printTeacherDetails(){
        System.out.println("Name: "+name+"\nSubjects Teaching: "+subjects+"\nSalary: "+salary+"\nEducation: "+education);
    }
}
