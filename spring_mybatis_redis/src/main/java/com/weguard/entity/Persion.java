package com.weguard.entity;

public class Persion {
    private Student student;
    private Teacher teacher;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "student=" + student +
                ", teacher=" + teacher +
                ", name='" + name + '\'' +
                '}';
    }
}
