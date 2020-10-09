package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lecture{
    private String course_name;
    private String course_title;
    private List<Student> roll_call;

    public Lecture(String course_name, String course_title) {
        this.course_name = course_name;
        this.course_title = course_title;
        this.roll_call = new ArrayList();
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public void enter(Student student){
        this.roll_call.add(student);
    }
}
