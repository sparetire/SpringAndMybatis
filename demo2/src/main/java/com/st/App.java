package com.st;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/application-context.xml");
        Performer duke = (Performer) context.getBean("duke");
        Performer duke1 = (Performer) context.getBean("duke");
        if (duke.hashCode() == duke1.hashCode()) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
