package com.company;

public class NaughtyStudent extends Student{
    boolean changedGradeAverage = false;

    public NaughtyStudent(String name, String ID, int[] grades, String level) {
        super(name, ID, grades, level);
    }

    public void increaseReportedGradeAverage(){
        double grade = super.getAvg_grade();
        double incremented_grade_avg = grade + (grade * 0.1);
        super.setAvg_grade(incremented_grade_avg);
        changedGradeAverage = true;
    }

    public boolean getStateOfGradeChangeFlag(){
        return this.changedGradeAverage;
    }
}
