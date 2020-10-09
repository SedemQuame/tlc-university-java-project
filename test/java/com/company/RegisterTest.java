package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    //list
    List<Student> listOfStudents = new ArrayList<>();
    //creating student classes
    int[] studentGrade1 = {70, 89, 70, 76};
    int[] studentGrade2 = {54, 56, 86, 56};
    int[] studentGrade3 = {89, 87, 50, 55};
    Student student_1 = new Student("Abena Serwaa", "635", studentGrade1,  Level.l100);
    Student student_2 = new Student("Aba Serwaa", "636", studentGrade2, Level.l100);
    Student student_3 = new Student("Ama Serwaa", "637", studentGrade3, Level.l100);

    @Test
    void getRegister() {
        listOfStudents.add(student_1);
        listOfStudents.add(student_2);
        listOfStudents.add(student_3);

        //create a new instance of Register
        Register register = new Register(listOfStudents);

        List<String> listOfNames = register.getRegister();
        assertTrue(listOfNames.contains("Abena Serwaa"));
        assertTrue(listOfNames.contains("Aba Serwaa"));
        assertTrue(listOfNames.contains("Ama Serwaa"));
    }
}