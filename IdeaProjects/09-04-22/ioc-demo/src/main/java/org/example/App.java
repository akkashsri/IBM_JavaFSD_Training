package org.example;

import org.example.beans.Coach;
import org.example.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Coach myCoach = context.getBean("theCoach", Coach.class);
            System.out.println(myCoach.getDailyWorkout());
            System.out.println((myCoach.getDailyFortune()));

//            Employee tempEmployee = context.getBean("employee", Employee.class);
//            tempEmployee.setFirstName("Sachin");
//            tempEmployee.setLastName("tendulkar");
//            tempEmployee.setEmail("sachin@email.com");
//            System.out.println(tempEmployee);
//
//            Employee e2 = context.getBean("employee", Employee.class);
//            tempEmployee.setFirstName("Sachin");
//            tempEmployee.setLastName("tendulkar");
//            tempEmployee.setEmail("sachin@email.com");
//            System.out.println(e2);
//
//            System.out.println(tempEmployee==e2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
