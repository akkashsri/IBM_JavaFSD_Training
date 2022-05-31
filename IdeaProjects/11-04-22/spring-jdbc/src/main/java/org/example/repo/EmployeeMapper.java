package org.example.repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.example.model.Employee;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee=new Employee();
        employee.setEmployeeId(rs.getInt(1));
        employee.setEmployeeName(rs.getString(2));
        return employee;
    }

}
