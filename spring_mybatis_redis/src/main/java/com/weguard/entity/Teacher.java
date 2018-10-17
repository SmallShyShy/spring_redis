package com.weguard.entity;

public class Teacher {
    private String name;
    private int age;
    private Student stud;
    public  Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Teacher(Student student){
        stud=student;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStud(Student stud) {
        this.stud = stud;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student getStud() {
        return stud;
    }
}
