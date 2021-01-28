package com.huynhbaoloc;

import com.huynhbaoloc.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorldBean");
        helloWorld.setMessage("hello world");
        System.out.println(helloWorld.getMessage());
        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("helloWorldBean");
        System.out.println(helloWorld1.getMessage());

    }
}
