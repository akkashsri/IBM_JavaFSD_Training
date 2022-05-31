package org.example.repo;

import java.sql.SQLException;

import org.example.model.Employee;

public interface EmployeeRepository {

    public void createEmployee(Employee employee) throws SQLException;

    public Employee findEmployeeById(int id) throws SQLException;

    public java.util.Collection<Employee> getAllEmployees() throws SQLException;

}
