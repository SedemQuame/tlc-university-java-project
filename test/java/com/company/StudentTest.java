package com.company;



import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

class StudentTest {







    @org.junit.jupiter.api.Test
    void getAvg_grade() {
        ArrayList<Integer> st_grade = new ArrayList<>();
        st_grade.add(20);
        st_grade.add(20);
        st_grade.add(20);
        Student student= new Student("Emma","1234A", st_grade, "100" );
        assertTrue((20.6+20.6+20.6)/3 == student.getAvg_grade());
    }
}