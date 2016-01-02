package com.st;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/application-context.xml");
        Performer duke = (Performer) context.getBean("duke");
        Performer tom = (Performer) context.getBean("tom");
        Performer poeticDuke = (Performer) context.getBean("poeticDuke");
        Performer jack = (Performer) context.getBean("jack");
        Stage stage = (Stage) context.getBean("stage");
        stage.open();
        try {
            duke.perform();
            tom.perform();
            poeticDuke.perform();
            jack.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }
    }
}
