package org.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Department {
    private String depName = "Accounting";
    private String location = "India";

    public Department() {
        super();
    }

    public Department(String depName, String location) {
        this.depName = depName;
        this.location = location;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department[" +
                "depName='" + depName + '\'' +
                ", location='" + location + '\'' +
                ']';
    }
}
