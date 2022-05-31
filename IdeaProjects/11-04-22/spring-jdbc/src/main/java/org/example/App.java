package org.example;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Scanner;

import org.example.config.SpringConfig;
import org.example.model.Employee;
import org.example.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    private static Scanner scanner=new Scanner(System.in);
    private static ApplicationContext context;
    public static void main( String[] args )
    {

        context = new AnnotationConfigApplicationContext(SpringConfig.class);

        EmployeeService employeeService=context.getBean("employeeService",EmployeeService.class);

        //System.out.println("Enter Employee Name: ");
        System.out.println("Enter your choice: ");
        System.out.println("Enter Employee Id: ");
        //	String name=scanner.next();
        //Employee employee=new Employee(name);
        int id=scanner.nextInt();
        try {
            //employeeService.createEmployee(employee);

            //System.out.println("employee created successfully......");
            System.out.println(employeeService.findEmployeeById(id));
            Collection<Employee> collection=employeeService.getAllEmployees();
            for(Employee e:collection)
            {
                System.out.println(e);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
