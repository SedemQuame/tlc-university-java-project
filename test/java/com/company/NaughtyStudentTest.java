package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {
    //new naughty student
    int [] grades = {45, 34, 65, 90};
    NaughtyStudent sedem = new NaughtyStudent("sedem", "ABC123", grades, Level.l100);

    @Test
    void getStateOfGradeChangeFlag() {
        sedem.increaseReportedGradeAverage();
        assertTrue(sedem.changedGradeAverage == true);
    }
}