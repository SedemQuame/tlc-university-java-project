package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String ID;
    private int [] grades;
    private double avg_grade;
    private String level;


    public Student(String name, String ID, int [] grades, String level) {

    private List<Integer> grades;
    private double avg_grade;
    private String level;

    public Student(String name, String ID, ArrayList<Integer> grades, String level) {
>>>>>>> basic
||||||| merged common ancestors
>>>>>>>>> Temporary merge branch 2
=======
=======
    public Student(String name, String ID, int []grades, String level) {
>>>>>>> basic
>>>>>>> ac400b753b93148fe10aa9ae2c08b7a494143e28
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


<<<<<<< HEAD
<<<<<<< HEAD
||||||| merged common ancestors
<<<<<<<<< Temporary merge branch 1
    public List<Integer> getGrades() {
||||||||| 445e6ee
    public List<Double> getGrades() {
=========
=======
>>>>>>> ac400b753b93148fe10aa9ae2c08b7a494143e28
    public int[] getGrades() {
        return grades;
    }

<<<<<<< HEAD
||||||| merged common ancestors
<<<<<<<<< Temporary merge branch 1
    public void setGrades(List<Integer> grades) {
||||||||| 445e6ee
    public void setGrades(List<Double> grades) {
=========
=======
<<<<<<< HEAD
>>>>>>> ac400b753b93148fe10aa9ae2c08b7a494143e28
    public void setGrades(int[] grades) {
<<<<<<< HEAD
=======
    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
>>>>>>> basic
||||||| merged common ancestors
>>>>>>>>> Temporary merge branch 2
=======
=======
    public void setGrades(int[]grades) {
>>>>>>> basic
>>>>>>> ac400b753b93148fe10aa9ae2c08b7a494143e28
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
<<<<<<< HEAD
        double total = 0, avg;
        for (double grade : grades) {
            total = +grade;
        }
        int number_of_grades = 4 ;
        avg = total / number_of_grades;
        this.avg_grade = avg;
=======
        double total =0.00, avg;
        for(int grade :grades){
            total =total+ grade;
        }
        int number_of_grades=grades.length;
        avg=total/number_of_grades;
        this.avg_grade=avg;
>>>>>>> basic
        return avg_grade;
    }
}
