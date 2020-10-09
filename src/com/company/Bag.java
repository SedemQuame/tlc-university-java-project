package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bag<E> {
    private List<E> bag;

    public Bag() {
        this.bag = new ArrayList<>();
    }

    public void add(E obj){
        this.bag.add(obj);
    }

    public void remove(E obj){
        this.bag.remove(obj);
    }

    public void clear(){
        bag.clear();
    }
}
