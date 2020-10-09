package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {
    //creating a lecture class
    Lecture lecture = new Lecture("calculus", "TURNTABL123");

    int[] studentGrade1 = {70, 89, 70, 76};
    int[] studentGrade2 = {54, 56, 86, 56};
    int[] studentGrade3 = {89, 87, 50, 55};
    int[] studentGrade4 = {93, 34, 87, 65};

    //creating student classes
    Student student_1 = new Student("Abena Serwaa", "635", studentGrade1, "Level 200 ");
    Student student_2 = new Student("Aba Serwaa", "636", studentGrade2, "Level 200 ");
    Student student_3 = new Student("Ama Serwaa", "637", studentGrade3, "Level 100 ");


    @Test
    void enter() {
        lecture.enter(student_1);
        lecture.enter(student_2);
        lecture.enter(student_3);

        assertTrue(lecture.getRollCallSize() == 3);
    }

    @Test
    void getHighestAverageGrade() {
        assertTrue(lecture.getHighestAverageGrade() > 76);
    }
}