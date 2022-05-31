package org.example.demo;

import org.example.demo.beans.Coach;
import org.example.demo.beans.FortuneService;
import org.example.demo.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            Coach coach = context.getBean("swimming", Coach.class);
            System.out.println(coach.getDailyWorkout());
            System.out.println(coach.getDailyFortune());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
