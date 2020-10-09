package com.company;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {
    private List<Student> bag = new ArrayList<>();

    public BagOfStudents(List<Student> bag) {
        this.bag = bag;
    }

    public void add(Student student){
        bag.add(student);
    }

    public void remove(Student student){
        bag.remove(student);
    }

    public void clear(){
        bag.clear();
    }
}
