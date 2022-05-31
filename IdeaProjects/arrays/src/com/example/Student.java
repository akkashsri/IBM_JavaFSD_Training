package com.example;

public class Student {
    private int id;
    private String name;
    private double cgpa;
    public Student (int id, String name, double cgpa) {
        super();
        this.id =id;
        this.name = name;
        this.cgpa =cgpa;
    }
    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public double getcgpa() {
        return cgpa;
    }
    public void setcgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    @Override
    public boolean equals(Object obj) {
        Student student=(Student)obj;
        if(this.getid()==student.getid()&&(this.getname()==student.getname()&&this.getcgpa()==student.getcgpa()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Student Id: "+id+" Student Name: "+name+" Student CGPA: "+cgpa;
    }
    @Override
    public int hashCode() {

        return super.hashCode();
    }

    
}

