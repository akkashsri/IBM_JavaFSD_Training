package org.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.example.demo.model.CGPAComparator;
import org.example.demo.model.Student;

public class Main {

    public static void main(String[] args) {
//        Set<Student> students=new TreeSet<Student>();
//        students.add(new Student(1, "John", 3.8));
//        students.add(new Student(2, "Marry", 3.1));
//        students.add(new Student(3, "Rahul", 3.9));
//        students.add(new Student(4, "Sachin", 3.0));
//        Iterator<Student> iterator=students.iterator();
//        Set<Employee> employees=new TreeSet<Employee>();
//        employees.add(new Employee(3, "Rahul", 1000));
//        employees.add(new Employee(2, "Marry", 30000));
//        employees.add(new Employee(1, "John", 8700));
//        employees.add(new Employee(4, "Sachin", 3740));
//        Iterator<Employee> iterator=employees.iterator();
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }

        Comparator c=new CGPAComparator();
        Set<Student> students=new TreeSet<Student>(c);
        students.add(new Student(1, "John", 3.8));
        students.add(new Student(2, "Marry", 3.1));
        students.add(new Student(3, "Rahul", 3.9));
        students.add(new Student(4, "Sachin", 3.0));
        Iterator<Student> iterator=students.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }

}