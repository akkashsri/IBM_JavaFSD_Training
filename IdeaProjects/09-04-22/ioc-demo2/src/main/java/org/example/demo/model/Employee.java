package org.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int empId;
    private String empName;
    private  double salary;

    //Attribute Level Dependency Injection...
//    @Autowired
    private Department department;

    public Employee() {
        super();
    }

    //Constructor level DI...   @Autowired not required
//    @Autowired
    public Employee(Department department) {
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return this.department;
    }

    // Setter DI...
//    @Autowired
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ']';
    }
}
