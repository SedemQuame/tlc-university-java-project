package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Register implements Registerable{
    private List<Student> students;

    public Register(List<Student> list) {
        this.students = list;
    }

    public List<String> getRegister(){
//        List<String> names = new ArrayList<>();
//        for (Student student: list) {
//            names.add(student.getName());
//        }
//        return names;
        List<String> names=
        students.stream()
                .map(l-> l.getName())
                .collect(Collectors.toList());

        return names;

    }
    public List<Student> getRegisterByLevel(List <Student> x) {
        return x;
    }

//    @Override
//    public int getRegisterByLevel() {
//        return 0;
//    }

    public double getHighestGrade(){
        Comparator<Student> comparator = Comparator.comparing( Student::getAvg_grade );
        Student max =students.stream().max(comparator).get();
       return max.getAvg_grade();
    }

    public List<Double> getAllGrades(){
        List<Double> averages =
                students.stream()
                        .map(student -> student.getAvg_grade())
                        .collect(Collectors.toList());
        return averages;
    }

    public List<Double> getTopStudents(){
        return students.stream()
                .filter(student->student.getAvg_grade() >60)
                .map(student -> student.getAvg_grade())
                .collect(Collectors.toList());
    }

}
