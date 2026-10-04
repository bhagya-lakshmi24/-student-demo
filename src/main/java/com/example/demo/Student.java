package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private College college;

    public Student(College college) {
        this.college = college;
    }

    public void study() {
        System.out.println("Student is studying");
        college.display();
    }
}