package com.company;



import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void getAvg_grade() {
       int [] st_grade={20,20,20};

        Student student= new Student("Emma","1234A", st_grade, "100" );
        assertEquals(20, student.getAvg_grade());
    }


}
