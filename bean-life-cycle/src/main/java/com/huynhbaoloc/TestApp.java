package com.huynhbaoloc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        DatabaseInitiaizer databaseInitiaizer = applicationContext.getBean(DatabaseInitiaizer.class);
        applicationContext.close();

    }
}
