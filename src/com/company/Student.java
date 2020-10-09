package com.company;

public class Student {
    private String name;
    private String ID;
    private int [] grades;
    private double avg_grade;
    private String level;


    public Student(String name, String ID, int []grades, String level) {

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


    public int[] getGrades() {
        return grades;
    }


    public void setGrades(int[]grades) {
        this.grades = grades;
    }

    public void setAvg_grade(double avg_grade) {
        this.avg_grade = avg_grade;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }


    public double getAvg_grade() {
        double total =0.00, avg;
        for(int grade :grades){
            total =total+ grade;
        }
        int number_of_grades=grades.length;
        avg=total/number_of_grades;
        this.avg_grade=avg;

        return avg_grade;
    }
}
