package com.company;

import java.util.ArrayList;
import java.util.List;

public class BagOfLecture {
    private List<Lecture> bag = new ArrayList<>();

    public BagOfLecture(List<Lecture> bag) {
        this.bag = bag;
    }

    public void add(Lecture Lecture){
        bag.add(Lecture);
    }

    public void remove(Lecture Lecture){
        bag.remove(Lecture);
    }

    public void clear(){
        bag.clear();
    }
}
