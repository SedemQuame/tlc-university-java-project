package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String ID;


    private List<Integer> grades;
    private double avg_grade;
    private String level;

    public Student(String name, String ID, ArrayList<Integer> grades, String level) {
        this.name = name;
        this.ID = ID;
        this.grades = grades;
        this.level = level;
        getAvg_grade();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }


    public double getAvg_grade() {
        double total =0, avg;
        for(double grade :grades){
            total=+ grade;
        }
        int number_of_grades=grades.size();
        avg=total/number_of_grades;
        this.avg_grade=avg;
        return avg_grade;
    }
}
