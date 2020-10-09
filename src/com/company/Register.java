package com.company;

import java.util.ArrayList;
import java.util.List;

public class Register implements Registerable{
    private List<Student> list;

    public Register(List<Student> list) {
        this.list = list;
    }

    public List<String> getRegister(){
        List<String> names = new ArrayList<>();
        for (Student student: list) {
            names.add(student.getName());
        }
        return names;
    }

    public List<Student> getRegisterByLevel(List <Student> x) {
        return x;
    }

    @Override
    public int getRegisterByLevel() {
        return 0;
    }
}
