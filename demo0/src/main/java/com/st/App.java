package com.st;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("conf/application-context.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"conf/application-context.xml", "conf/new-context.xml"});
        Performer duke = (Performer) context.getBean("duke");
        Performer tom = (Performer) context.getBean("tom");
        Performer kudo = (Performer) context.getBean("kudo");
        try {
            duke.perform();
            tom.perform();
            kudo.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }
    }
}
