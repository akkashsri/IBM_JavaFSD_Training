package org.example.beans;

public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;

    public Employee() {
        this(101, "Marry", "Public", "marry@email.com");
        System.out.println("Within Default constructor");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
    }

    public Employee(int employeeId, String firstName, String lastName, String email) {
        System.out.println("Within another constructor...");
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ']';
    }
}
