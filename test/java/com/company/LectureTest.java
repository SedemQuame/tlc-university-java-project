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
    int[] studentGrade5 = {93, 90, 84, 65};

    //creating student classes
    Student student_1 = new Student("Abena Serwaa", "635", studentGrade1, Level.l100);
    Student student_2 = new Student("Aba Serwaa", "636", studentGrade2, Level.l200);
    Student student_3 = new Student("Ama Serwaa", "637", studentGrade3, Level.l100);

    //inserting a few naughty students into the lecture.
    NaughtyStudent student_4 = new NaughtyStudent("Justin Ankobrahene", "ABC23", studentGrade4, Level.l100);
    NaughtyStudent student_5 = new NaughtyStudent("Kweku Meynu", "AC123", studentGrade5, Level.l200);


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

    @Test
    void checkIfStudentScoresHigher() {
        student_4.increaseReportedGradeAverage();
        assertTrue(student_4.getStateOfGradeChangeFlag() == true);
    }
}