package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {
    //creating a lecture class
    Lecture lecture = new Lecture("calculus", "TURNTABL123");

    List<Double> gradeTrain = new ArrayList<>();
    gradeTrain.add

    //creating student classes
    Student student_1 = new Student("Abena Serwaa", "635", Collections.singletonList(54.2),"Level 200 ");
    Student student_2 = new Student("Aba Serwaa", "636", Collections.singletonList(53.2),"Level 200 ");
    Student student_3 = new Student("Ama Serwaa", "637", Collections.singletonList(52.2),"Level 100 ");

    @Test
    void enter() {
    }

    @Test
    void getHighestAverageGrade() {
    }
}