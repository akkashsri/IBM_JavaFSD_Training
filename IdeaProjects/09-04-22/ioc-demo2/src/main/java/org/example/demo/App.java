package org.example.demo;

import org.example.demo.config.SpringConfig;
import org.example.demo.model.Department;
import org.example.demo.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//            Employee emp = context.getBean(Employee.class);
//            Department department = context.getBean(Department.class);
//            emp.setEmpId(101);
//            emp.setEmpName("John Doe");
//            emp.setSalary(10000);
//            emp.setDepartment(department);
//            System.out.println(emp);

            DataSource dataSource = context.getBean("dataSource", DataSource.class);
            Connection connection = dataSource.getConnection();
            System.out.println(connection);

            PreparedStatement preparedStatement = connection.prepareStatement("insert into emp(Emp_Name) value ('Taylor')");
            preparedStatement.executeUpdate();
            System.out.println("inserted");

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from emp");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}