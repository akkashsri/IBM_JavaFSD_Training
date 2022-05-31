package org.example.service;

import java.sql.SQLException;
import java.util.Collection;

import org.example.model.Employee;
import org.example.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(Employee employee) throws SQLException {
        employeeRepository.createEmployee(employee);

    }

    @Override
    public Employee findEmployeeById(int id) throws SQLException {
        // TODO Auto-generated method stub
        return employeeRepository.findEmployeeById(id);
    }

    @Override
    public Collection<Employee> getAllEmployees() throws SQLException {

        return employeeRepository.getAllEmployees();
    }

}
