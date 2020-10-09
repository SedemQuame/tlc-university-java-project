package com.company;

import java.util.List;

public class Student {
    private String name;
    private String ID;


    private List<Double> grades;
    private double avg_grade;
    private String level;

    public Student(String name, String ID, List<Double> grades, String level) {
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


    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
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
